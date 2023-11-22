package com.mobmasterp.sgeventos2617684;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClienteAPI {
    private static String HOST = "https://sgeventos2617684.onrender.com/";
    public static Retrofit getClient(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
