package com.hritesh.worldnews.di


import com.hritesh.worldnews.data.repository.NewsRepositoryImpl
import com.hritesh.worldnews.data.web.NewApi
import com.hritesh.worldnews.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideNewsRepository(api: NewApi): NewsRepository {
        return NewsRepositoryImpl(api)
    }

}