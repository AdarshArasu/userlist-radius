package com.example.userlistapplication.Retrofit;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static final int REQ_TIME_OUT = 10;
    public static String SERVICE_BASE_URL = "https://raw.githubusercontent.com/";

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit;
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(REQ_TIME_OUT, TimeUnit.MINUTES)
                .readTimeout(REQ_TIME_OUT, TimeUnit.MINUTES).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(SERVICE_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit.create(serviceClass);
    }
}