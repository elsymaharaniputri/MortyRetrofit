package com.example.projectafterapi.api

import com.example.projectafterapi.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
        //end point dari api di salin
        @GET("character")

        fun getMorty (): Call<ResponseMorty>

}