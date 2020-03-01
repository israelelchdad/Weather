package com.example.weather.Moudel;

import java.util.ArrayList;
import java.util.Arrays;

public class AllCountry {
    public ArrayList<Country> allCountry;

    public ArrayList<Country> getAllCountry() {
        return allCountry;
    }

    public void setAllCountry(ArrayList<Country> allCountry) {
        this.allCountry = allCountry;
    }

    public AllCountry(Country[] allCountry) {
        this.allCountry = new ArrayList<>(Arrays.asList(allCountry));
    }
}
