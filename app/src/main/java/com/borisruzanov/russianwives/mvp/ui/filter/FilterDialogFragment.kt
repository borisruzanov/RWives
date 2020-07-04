package com.borisruzanov.russianwives.mvp.ui.filter

import android.content.Context
import android.os.Bundle
import android.support.annotation.ArrayRes
import android.support.v7.widget.SwitchCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import butterknife.ButterKnife
import butterknife.OnClick
import com.arellomobile.mvp.MvpAppCompatDialogFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.borisruzanov.russianwives.R
import com.borisruzanov.russianwives.di.component
import com.borisruzanov.russianwives.utils.FilterConfig
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class FilterDialogFragment : MvpAppCompatDialogFragment(), FilterView {

    @Inject
    @InjectPresenter
    lateinit var presenter: FilterDialogPresenter

    @ProvidePresenter
    fun provideFilterDialogPresenter() = presenter

    lateinit var mGenderSpinner: Spinner

    lateinit var mAgeSpinner: Spinner

    lateinit var mCountrySpinner: Spinner

    lateinit var mRelationshipSpinner: Spinner

    lateinit var mBodySpinner: Spinner

    lateinit var mEthnicitySpinner: Spinner

    lateinit var mFaithSpinner: Spinner

    lateinit var mSmokeSpinner: Spinner

    lateinit var mDrinkSpinner: Spinner

    lateinit var mHaveKidsSpinner: Spinner

    lateinit var mWantKidsSpinner: Spinner

    lateinit var spinners: MutableList<Spinner>

    private lateinit var filterListener: FilterListener

    lateinit var mCitySpinner: Spinner //a city spinner object
    lateinit var mOnlineSwitch:SwitchCompat //a switch to set online users

    interface FilterListener {
        fun onUpdate()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        requireActivity().component.inject(this)
        super.onCreate(savedInstanceState)
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (context is FilterListener) {
            filterListener = context
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dialog.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        val view = inflater.inflate(R.layout.dialog_filters, container, false)
        spinners = ArrayList()
        mGenderSpinner = view.findViewById(R.id.spinner_gender_ni)
        spinners.add(mGenderSpinner)
        mAgeSpinner = view.findViewById(R.id.spinner_age_ni)
        spinners.add(mAgeSpinner)
        mCountrySpinner = view.findViewById(R.id.spinner_country)
        spinners.add(mCountrySpinner)
        mRelationshipSpinner = view.findViewById(R.id.spinner_relationship_statuses)
        spinners.add(mRelationshipSpinner)
        mBodySpinner = view.findViewById(R.id.spinner_body_types)
        spinners.add(mBodySpinner)
        mEthnicitySpinner = view.findViewById(R.id.spinner_ethnicities)
        spinners.add(mEthnicitySpinner)
        mFaithSpinner = view.findViewById(R.id.spinner_faith_types)
        spinners.add(mFaithSpinner)
        mSmokeSpinner = view.findViewById(R.id.spinner_smoke_statuses)
        spinners.add(mSmokeSpinner)
        mDrinkSpinner = view.findViewById(R.id.spinner_drink_statuses)
        spinners.add(mDrinkSpinner)
        mHaveKidsSpinner = view.findViewById(R.id.spinner_have_kids_statuses)
        spinners.add(mHaveKidsSpinner)
        mWantKidsSpinner = view.findViewById(R.id.spinner_want_kids_statuses)
        spinners.add(mWantKidsSpinner)
        mCitySpinner=view.findViewById(R.id.spinner_city)
        spinners.add(mCitySpinner)
        mOnlineSwitch=view.findViewById(R.id.online_switch)
        ButterKnife.bind(this, view)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.getSavedValues()
        mOnlineSwitch.isChecked = FilterConfig.isOnline()
    }

    override fun onResume() {
        super.onResume()
        dialog.window!!.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        addListner()
    }

    @OnClick(R.id.button_search)
    fun onSearchClicked() {
        presenter.saveValues(spinners,mOnlineSwitch.isChecked)
        filterListener.onUpdate()
        dismiss()
    }

    @OnClick(R.id.button_cancel)
    fun onCancelClicked() {
        dismiss()
    }

    override fun getSavedValues(stringList: List<String>, resIdList: List<Int>) {
        for (i in stringList.indices) {
            if (presenter.isNotDefault(stringList[i])) {
                spinners[i].setSelection(getIndexOfElement(resIdList[i], stringList[i]))
            }
        }
    }

    private fun getIndexOfElement(@ArrayRes resId: Int, value: String): Int {
        val list = Arrays.asList(*resources.getStringArray(resId))
        return list.indexOf(value)
    }

    companion object {
        var TAG = "Dialog Fragment"
    }

    /***
     * to add listener on a country spinner
     * This method set city spinner value as soon as country is selected
     */
    private fun addListner(){
        mCountrySpinner.onItemSelectedListener= object:OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val array:ArrayAdapter<CharSequence>
                //set city according the selected country position
                array = when(position){
                    91-> ArrayAdapter.createFromResource(activity,R.array.kazakhstan_city,android.R.layout.simple_spinner_item)
                    147-> ArrayAdapter.createFromResource(activity,R.array.russia_city,android.R.layout.simple_spinner_item)
                    186-> ArrayAdapter.createFromResource(activity,R.array.ukraine_city,android.R.layout.simple_spinner_item)
                    188-> ArrayAdapter.createFromResource(activity,R.array.us_city,android.R.layout.simple_spinner_item)
                    else-> ArrayAdapter.createFromResource(activity,R.array.default_city,android.R.layout.simple_spinner_item)
                }
                //set adapter on city spinner
                array.also {
                    adapter ->adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    mCitySpinner.adapter=adapter
                }
            }

        }
    }
}
