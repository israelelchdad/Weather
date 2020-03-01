package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.weather.Moudel.AllCountry;
import com.example.weather.Moudel.Country;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country>myListCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListCountries();
    }

    private void initListCountries() {
        Call<Country[]> call = RestClient.mycounryisService.serchContryByRegion("europe");
        call.enqueue(new Callback<Country[]>() {
            @Override
            public void onResponse(Call<Country[]> call, Response<Country[]> response) {
                Country[] myAreyCounty= response.body();
                myListCountry = new ArrayList<>(Arrays.asList(myAreyCounty));
                int a = 5;
            }

            @Override
            public void onFailure(Call<Country[]> call, Throwable t) {
                int b = 6;
                int c = 7;

            }
        });


    }
}
