package com.mana.testapplication.data

import com.mana.testapplication.BuildConfig
import com.mana.testapplication.data.remote.responses.ImageResponse
import retrofit2.Response
import retrofit2.http.Query

interface PixabayAPI {

   suspend fun searchForImage(
       @Query("q") searchQuery:String,
       @Query("key")apiKey:String = BuildConfig.MY_API_KEY
   ):Response<ImageResponse>


}