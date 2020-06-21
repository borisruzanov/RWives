// Generated code from Butter Knife. Do not modify!
package com.borisruzanov.russianwives.mvp.ui.purchasedialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.borisruzanov.russianwives.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PurchaseDialogFragment_ViewBinding implements Unbinder {
  private PurchaseDialogFragment target;

  private View view2131296792;

  private View view2131296790;

  @UiThread
  public PurchaseDialogFragment_ViewBinding(final PurchaseDialogFragment target, View source) {
    this.target = target;

    View view;
    target.coinsAmountTv = Utils.findRequiredViewAsType(source, R.id.purchase_coins_text, "field 'coinsAmountTv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.purchase_confirm_btn, "method 'onConfirmClicked'");
    view2131296792 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onConfirmClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.purchase_cancel_btn, "method 'onCancelClicked'");
    view2131296790 = view;
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
    PurchaseDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.coinsAmountTv = null;

    view2131296792.setOnClickListener(null);
    view2131296792 = null;
    view2131296790.setOnClickListener(null);
    view2131296790 = null;
  }
}
