package com.example.apidata

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET(/* value = */ "/posts")
    fun getPosts(): Call<MutableList<PostModel>>
}