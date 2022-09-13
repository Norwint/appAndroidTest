package com.otcengineering.dreamer.network

import com.otcengineering.dreamer.serial.LoginRequest
import com.otcengineering.dreamer.serial.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface NetworkApi {

    @POST("/loginDreamer")
    fun login(@Body loginRequest: LoginRequest) : Call<LoginResponse>
}