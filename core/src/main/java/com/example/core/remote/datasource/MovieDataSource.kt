package com.example.core.remote.datasource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.core.remote.service.HomeApiService
import com.example.core.repos.home.MovieType
import com.example.core.remote.response.home.Result
class MovieDataSource(
    private val apiService: HomeApiService,
    private val movieType: MovieType
) : PagingSource<Int, Result>() {


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        val page = params.key ?: 1
        val prevKey = if (page == 1) null else page - 1
        val nextKey = page + 1
        return try {
            val response = when (movieType) {

                MovieType.POPULAR -> {
                    apiService.getPopularMovie(page = page)
                }
                MovieType.NOW_PLAYING -> {
                    apiService.getNowPlayingMovie(page = page)
                }
                MovieType.UPCOMING -> {
                    apiService.getUpComingMovie(page = page)
                }
            }
            LoadResult.Page(
                data = response.results,
                nextKey = nextKey,
                prevKey = prevKey
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition
    }
}