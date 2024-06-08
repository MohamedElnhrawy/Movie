package com.example.core.repos.home;

import com.example.core.local.dao.PlayingMovieDao;
import com.example.core.local.dao.PopularMovieDao;
import com.example.core.local.dao.UpcomingMovieDao;
import com.example.core.local.database.MovieDatabase;
import com.example.core.local.entity.PlayingMovieEntity;
import com.example.core.local.entity.PopularMovieEntity;
import com.example.core.local.entity.UpcomingMovieEntity;
import com.example.core.remote.datasource.MovieDataSource;
import com.example.core.repos.home.paging.PlayingMoviesListRemoteMediator;
import com.example.core.repos.home.paging.PopularMoviesListRemoteMediator;
import com.example.core.repos.home.paging.UpcomingMoviesListRemoteMediator;
import com.example.core.repos.paging.utils.PagingDataWithSource;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/core/repos/home/MovieType;", "", "(Ljava/lang/String;I)V", "NOW_PLAYING", "POPULAR", "UPCOMING", "core_debug"})
public enum MovieType {
    /*public static final*/ NOW_PLAYING /* = new NOW_PLAYING() */,
    /*public static final*/ POPULAR /* = new POPULAR() */,
    /*public static final*/ UPCOMING /* = new UPCOMING() */;
    
    MovieType() {
    }
}