package com.pp.maproute.network;

import com.pp.maproute.models.AboutUsResponse;
import com.pp.maproute.models.CheckCredentialsResponse;
import com.pp.maproute.models.DriverAccountBody;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface MapRouteServices {

    @Headers("Accept: application/json")
    @POST("account/checkCredentials")
    Call<CheckCredentialsResponse> checkCredentials(@Body DriverAccountBody driverAccountBody);

    @GET
    Call<AboutUsResponse> getAboutUsContent(@Url String url, @Header("Authorization") String authHeader);
}
