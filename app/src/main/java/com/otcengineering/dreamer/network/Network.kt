package com.otcengineering.dreamer.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


class Network {

   companion object {
       private var baseUrl = "https://mjnseras-dev.mjn.cat/access/"

       private var retrofit = Retrofit.Builder()
           .baseUrl(baseUrl)
           .addConverterFactory(GsonConverterFactory.create())
           .build()

       val api: NetworkApi by lazy { retrofit.create() }
   }

}
