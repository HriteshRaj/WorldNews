package com.hritesh.worldnews.presentation.bookmarks

import androidx.lifecycle.ViewModel
import com.hritesh.worldnews.data.database.NewsDatabase

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BookmarkViewModel @Inject constructor(val database: NewsDatabase) : ViewModel() {
    private val newsDao = database.newsDao()
    fun getBookmarks() = newsDao.getNews()
}