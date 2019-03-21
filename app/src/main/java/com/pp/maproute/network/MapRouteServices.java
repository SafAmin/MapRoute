package com.pp.maproute.network;

import com.pp.maproute.models.CheckCredentialsResponse;
import com.pp.maproute.models.DriverAccountBody;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface MapRouteServices {

    @Headers("Accept: application/json")
    @POST("account/checkCredentials")
    Call<CheckCredentialsResponse> checkCredentials(@Body DriverAccountBody driverAccountBody);
}
