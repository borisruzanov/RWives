// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.mvp.ui.search;

import com.borisruzanov.russianwives.mvp.model.interactor.coins.CoinsInteractor;
import com.borisruzanov.russianwives.mvp.model.interactor.search.SearchInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SearchPresenter_Factory implements Factory<SearchPresenter> {
  private final Provider<SearchInteractor> searchInteractorProvider;

  private final Provider<CoinsInteractor> coinsInteractorProvider;

  public SearchPresenter_Factory(
      Provider<SearchInteractor> searchInteractorProvider,
      Provider<CoinsInteractor> coinsInteractorProvider) {
    this.searchInteractorProvider = searchInteractorProvider;
    this.coinsInteractorProvider = coinsInteractorProvider;
  }

  @Override
  public SearchPresenter get() {
    return new SearchPresenter(searchInteractorProvider.get(), coinsInteractorProvider.get());
  }

  public static Factory<SearchPresenter> create(
      Provider<SearchInteractor> searchInteractorProvider,
      Provider<CoinsInteractor> coinsInteractorProvider) {
    return new SearchPresenter_Factory(searchInteractorProvider, coinsInteractorProvider);
  }
}
