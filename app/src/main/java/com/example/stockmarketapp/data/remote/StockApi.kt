package com.example.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query


interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apiKey") apikey: String
    ):ResponseBody

    companion object {
        const val API_KEY = "94OUUUUAT33IS4AJ"
        const val BASE_URL = "https://alphavantage.co"
    }
}