package com.example.core.di

import com.example.core.repos.details.DetailMovieRepository
import com.example.core.repos.home.MovieRepository
import com.example.core.usecase.details.DetailUseCases
import com.example.core.usecase.details.GetCastUseCase
import com.example.core.usecase.details.GetMovieDetailUseCase
import com.example.core.usecase.home.GetNowPlayingMovieUseCase
import com.example.core.usecase.home.GetPopularMovieUseCase
import com.example.core.usecase.home.GetUpcomingMovieUseCase
import com.example.core.usecase.home.HomeUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {


//    @Provides
//    @Singleton
//    fun provideSplashUseCases(
//        splashAuthRepository: SplashAuthRepository
//    ): SplashUseCases {
//        return SplashUseCases(
//            isSignedInUseCase = IsSignedInUseCase(
//                splashAuthRepository = splashAuthRepository
//            ),
//            readOnBoardingStateUseCase = ReadOnBoardingStateUseCase(
//                dataStoreRepository = dataStoreRepository
//            )
//        )
//    }

    @Provides
    @Singleton
    fun provideHomeUseCases(
        movieRepository: MovieRepository,
    ): HomeUseCases {
        return HomeUseCases(
            getNowPlayingMovieUseCase = GetNowPlayingMovieUseCase(
                movieRepository = movieRepository
            ),
            getPopularMovieUseCase = GetPopularMovieUseCase(
                movieRepository = movieRepository
            ),
            getUpcomingMovieUseCase = GetUpcomingMovieUseCase(
                movieRepository = movieRepository
            )
        )
    }

    @Provides
    @Singleton
    fun provideDetailUseCases(
        detailMovieRepository: DetailMovieRepository,
    ): DetailUseCases {
        return DetailUseCases(
            getCastUseCase = GetCastUseCase(
                detailMovieRepository = detailMovieRepository
            ),
            getMovieDetailUseCase = GetMovieDetailUseCase(
                detailMovieRepository = detailMovieRepository
            ),
        )
    }

//    @Provides
//    @Singleton
//    fun provideProfileUseCases(
//        imageRepository: ImageRepository,
//        profileAuthenticationRepository: ProfileAuthenticationRepository
//    ): com.example.profile.domain.usecase.ProfileUseCases {
//        return com.example.profile.domain.usecase.ProfileUseCases(
//            uploadProfileImageUseCase = com.example.profile.domain.usecase.UploadProfileImageUseCase(
//                imageRepository = imageRepository
//            ),
//            saveUserProfileImageUseCase = com.example.profile.domain.usecase.SaveUserProfileImageUseCase(
//                imageRepository = imageRepository
//            ),
//            signOutUseCase = com.example.profile.domain.usecase.SignOutUseCase(
//                authenticationRepository = profileAuthenticationRepository
//            )
//        )
//    }


//    @Provides
//    @Singleton
//    fun provideUseCase(
//        userRepository: UserRepository,
//    ): UseCases {
//        return UseCases(
//            getUserUseCase = GetUserUseCase(userRepository = userRepository),
//            getUserProfileImageUseCase = GetUserProfileImageUseCase(userRepository = userRepository),
//        )
//    }
}


