// Generated by Dagger (https://dagger.dev).
package com.example.core.di;

import com.example.core.remote.service.DetailApiService;
import com.example.core.repos.details.DetailMovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideDetailMovieRepositoryFactory implements Factory<DetailMovieRepository> {
  private final Provider<DetailApiService> detailApiServiceProvider;

  public RepositoryModule_ProvideDetailMovieRepositoryFactory(
      Provider<DetailApiService> detailApiServiceProvider) {
    this.detailApiServiceProvider = detailApiServiceProvider;
  }

  @Override
  public DetailMovieRepository get() {
    return provideDetailMovieRepository(detailApiServiceProvider.get());
  }

  public static RepositoryModule_ProvideDetailMovieRepositoryFactory create(
      Provider<DetailApiService> detailApiServiceProvider) {
    return new RepositoryModule_ProvideDetailMovieRepositoryFactory(detailApiServiceProvider);
  }

  public static DetailMovieRepository provideDetailMovieRepository(
      DetailApiService detailApiService) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideDetailMovieRepository(detailApiService));
  }
}