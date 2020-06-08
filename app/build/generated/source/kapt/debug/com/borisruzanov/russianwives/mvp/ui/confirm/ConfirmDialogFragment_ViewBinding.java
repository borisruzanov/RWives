// Generated code from Butter Knife. Do not modify!
package com.borisruzanov.russianwives.mvp.ui.confirm;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.borisruzanov.russianwives.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ConfirmDialogFragment_ViewBinding implements Unbinder {
  private ConfirmDialogFragment target;

  private View view2131296388;

  private View view2131296351;

  @UiThread
  public ConfirmDialogFragment_ViewBinding(final ConfirmDialogFragment target, View source) {
    this.target = target;

    View view;
    target.headerTv = Utils.findRequiredViewAsType(source, R.id.confirm_dialog_text, "field 'headerTv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.confirm_button, "field 'confirmButton' and method 'onConfirmClicked'");
    target.confirmButton = Utils.castView(view, R.id.confirm_button, "field 'confirmButton'", Button.class);
    view2131296388 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onConfirmClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.cancel_button, "field 'cancelButton' and method 'onCancelClicked'");
    target.cancelButton = Utils.castView(view, R.id.cancel_button, "field 'cancelButton'", Button.class);
    view2131296351 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCancelClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ConfirmDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.headerTv = null;
    target.confirmButton = null;
    target.cancelButton = null;

    view2131296388.setOnClickListener(null);
    view2131296388 = null;
    view2131296351.setOnClickListener(null);
    view2131296351 = null;
  }
}
