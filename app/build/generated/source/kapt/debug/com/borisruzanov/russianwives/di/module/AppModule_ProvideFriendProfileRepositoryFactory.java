// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.di.module;

import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.borisruzanov.russianwives.mvp.model.repository.friend.FriendRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideFriendProfileRepositoryFactory
    implements Factory<FriendRepository> {
  private final AppModule module;

  private final Provider<Prefs> prefsProvider;

  public AppModule_ProvideFriendProfileRepositoryFactory(
      AppModule module, Provider<Prefs> prefsProvider) {
    this.module = module;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public FriendRepository get() {
    return Preconditions.checkNotNull(
        module.provideFriendProfileRepository(prefsProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FriendRepository> create(AppModule module, Provider<Prefs> prefsProvider) {
    return new AppModule_ProvideFriendProfileRepositoryFactory(module, prefsProvider);
  }
}
