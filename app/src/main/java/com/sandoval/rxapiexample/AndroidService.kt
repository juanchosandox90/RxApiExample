package com.sandoval.rxapiexample

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class AndroidService {

    private val BASE_URL = "https://learn2crack-json.herokuapp.com"

    val requestInterface = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(RequestInterface::class.java)

    fun getAndroidObjects(): Single<List<Android>> {
        return requestInterface.getData()
    }

}