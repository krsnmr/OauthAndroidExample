package com.example.oauthandroidexample;

import retrofit2.Call;
import retrofit2.http.GET;

public interface VdkApiInterface {

    @GET("api/simple/")
    Call<String> simple();
}
