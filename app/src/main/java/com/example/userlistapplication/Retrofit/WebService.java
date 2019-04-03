package com.example.userlistapplication.Retrofit;


import com.example.userlistapplication.Model.Model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WebService {

    @GET("iranjith4/radius-intern-mobile/master/users.json")
    Call<Model> gerDatafromServer();
}
