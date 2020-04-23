// Generated code from Butter Knife. Do not modify!
package com.borisruzanov.russianwives.mvp.ui.mustinfo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.borisruzanov.russianwives.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MustInfoDialogFragment_ViewBinding implements Unbinder {
  private MustInfoDialogFragment target;

  private View view2131296345;

  private View view2131296296;

  @UiThread
  public MustInfoDialogFragment_ViewBinding(final MustInfoDialogFragment target, View source) {
    this.target = target;

    View view;
    target.ageSpinner = Utils.findRequiredViewAsType(source, R.id.spinner_age_mi, "field 'ageSpinner'", Spinner.class);
    target.countrySpinner = Utils.findRequiredViewAsType(source, R.id.spinner_country_mi, "field 'countrySpinner'", Spinner.class);
    view = Utils.findRequiredView(source, R.id.button_ok_mi, "field 'confirmButton' and method 'onButtonClicked'");
    target.confirmButton = Utils.castView(view, R.id.button_ok_mi, "field 'confirmButton'", Button.class);
    view2131296345 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.add_photo_btn_mi, "field 'addPhotoButton' and method 'onPhotoAddBtnClicked'");
    target.addPhotoButton = Utils.castView(view, R.id.add_photo_btn_mi, "field 'addPhotoButton'", Button.class);
    view2131296296 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPhotoAddBtnClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MustInfoDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ageSpinner = null;
    target.countrySpinner = null;
    target.confirmButton = null;
    target.addPhotoButton = null;

    view2131296345.setOnClickListener(null);
    view2131296345 = null;
    view2131296296.setOnClickListener(null);
    view2131296296 = null;
  }
}
