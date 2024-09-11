package com.hritesh.worldnews.data.web


import com.hritesh.worldnews.data.response.NewsResponse
import com.hritesh.worldnews.utils.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewApi {
    @GET("search-news")
    suspend fun getNews(
        @Query("country") country: String?,
        @Query("language") language: String,
        @Query("text") text: String?,
        @Query("news-sources") newsSources: String? = "https://www.bbc.co.uk",
        @Query("api-key") apiKey: String = API_KEY,
    ): Response<NewsResponse>
}