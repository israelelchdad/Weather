package com.example.weather;

import com.example.weather.Moudel.Country;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CounryisService {
    @GET("region/{nameRegion}")
    Call<Country[]> serchContryByRegion(@Path("nameRegion") String nameRegion);

}
