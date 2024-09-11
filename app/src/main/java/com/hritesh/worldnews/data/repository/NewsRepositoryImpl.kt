package com.hritesh.worldnews.data.repository
import com.hritesh.worldnews.data.response.NewsResponse
import com.hritesh.worldnews.data.web.NewApi

import com.hritesh.worldnews.domain.repository.NewsRepository

import retrofit2.Response
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(val api: NewApi) : NewsRepository {
    override suspend fun getNews(
        language: String,
        text: String?,
        country: String?
    ): Response<NewsResponse> {
        return api.getNews(country, language, text)
    }
}