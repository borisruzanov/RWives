// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.di.module;

import com.borisruzanov.russianwives.App;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideAppFactory implements Factory<App> {
  private final AppModule module;

  public AppModule_ProvideAppFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public App get() {
    return Preconditions.checkNotNull(
        module.provideApp(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<App> create(AppModule module) {
    return new AppModule_ProvideAppFactory(module);
  }
}
