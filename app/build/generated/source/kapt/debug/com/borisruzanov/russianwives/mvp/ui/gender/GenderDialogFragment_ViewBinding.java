// Generated code from Butter Knife. Do not modify!
package com.borisruzanov.russianwives.mvp.ui.gender;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.borisruzanov.russianwives.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GenderDialogFragment_ViewBinding implements Unbinder {
  private GenderDialogFragment target;

  private View view2131296388;

  @UiThread
  public GenderDialogFragment_ViewBinding(final GenderDialogFragment target, View source) {
    this.target = target;

    View view;
    target.genderSpinner = Utils.findRequiredViewAsType(source, R.id.dialog_spinner_gender, "field 'genderSpinner'", Spinner.class);
    target.policyTv = Utils.findRequiredViewAsType(source, R.id.policy_tv, "field 'policyTv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.confirm_button_gender, "method 'onConfirmClicked'");
    view2131296388 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onConfirmClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    GenderDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.genderSpinner = null;
    target.policyTv = null;

    view2131296388.setOnClickListener(null);
    view2131296388 = null;
  }
}
