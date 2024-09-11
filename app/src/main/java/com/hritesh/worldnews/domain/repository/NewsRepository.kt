package com.hritesh.worldnews.domain.repository


import com.hritesh.worldnews.data.response.NewsResponse
import retrofit2.Response

interface NewsRepository {
    suspend fun getNews(
        language: String,
        text: String?,
        country: String?,
    ): Response<NewsResponse>
}