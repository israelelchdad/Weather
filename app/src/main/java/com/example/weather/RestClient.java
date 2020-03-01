package com.example.weather;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private static final String BASE_URL = "https://restcountries.eu/rest/v2/";
    private static Retrofit myRetrofit = new  Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    static  CounryisService mycounryisService = myRetrofit.create(CounryisService.class);
}
