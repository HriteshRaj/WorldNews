
package com.hritesh.worldnews.data.response

import com.hritesh.worldnews.data.model.News

data class NewsResponse(
    val available: Int,
    val news: List<News>,
    val number: Int,
    val offset: Int
)