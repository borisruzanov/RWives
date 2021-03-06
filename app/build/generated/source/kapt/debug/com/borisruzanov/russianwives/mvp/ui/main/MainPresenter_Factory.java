// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.mvp.ui.main;

import com.borisruzanov.russianwives.mvp.model.interactor.main.MainInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MainPresenter_Factory implements Factory<MainPresenter> {
  private final Provider<MainInteractor> mainInteractorProvider;

  public MainPresenter_Factory(Provider<MainInteractor> mainInteractorProvider) {
    this.mainInteractorProvider = mainInteractorProvider;
  }

  @Override
  public MainPresenter get() {
    return new MainPresenter(mainInteractorProvider.get());
  }

  public static Factory<MainPresenter> create(Provider<MainInteractor> mainInteractorProvider) {
    return new MainPresenter_Factory(mainInteractorProvider);
  }
}
