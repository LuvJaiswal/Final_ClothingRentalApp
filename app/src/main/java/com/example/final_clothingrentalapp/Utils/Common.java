package com.example.final_clothingrentalapp.Utils;

import com.example.final_clothingrentalapp.Retrofit.RentalAPI;
import com.example.final_clothingrentalapp.Retrofit.RetrofitClient;

public class Common {

    private static final String BASE_URL = "http://192.168.1.115/islingtonclothesrental/";

    public static RentalAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(RentalAPI.class);
    }
}
