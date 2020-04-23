// Generated code from Butter Knife. Do not modify!
package com.borisruzanov.russianwives.mvp.ui.filter;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class FilterDialogFragment_ViewBinding implements Unbinder {
  private FilterDialogFragment target;

  private View view2131296347;

  private View view2131296340;

  @UiThread
  public FilterDialogFragment_ViewBinding(final FilterDialogFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, 2131296347, "method 'onSearchClicked'");
    view2131296347 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSearchClicked();
      }
    });
    view = Utils.findRequiredView(source, 2131296340, "method 'onCancelClicked'");
    view2131296340 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCancelClicked();
      }
    });
  }

  @Override
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131296347.setOnClickListener(null);
    view2131296347 = null;
    view2131296340.setOnClickListener(null);
    view2131296340 = null;
  }
}
