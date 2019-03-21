package com.pp.maproute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.pp.maproute.models.CheckCredentialsResponse;
import com.pp.maproute.models.DriverAccountBody;
import com.pp.maproute.network.MapRouteClient;
import com.pp.maproute.network.MapRouteServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DriverAccountBody driverAccountBody = new DriverAccountBody();
        driverAccountBody.setName("bola_d");
        driverAccountBody.setPassword("1234");
        driverAccountBody.setDeviceToken("");
        /*Create handle for the RetrofitInstance interface*/
        MapRouteServices service = MapRouteClient.getRetrofitInstance().create(MapRouteServices.class);
        Call<CheckCredentialsResponse> call = service.checkCredentials(driverAccountBody);
        call.enqueue(new Callback<CheckCredentialsResponse>() {
            @Override
            public void onResponse(Call<CheckCredentialsResponse> call, Response<CheckCredentialsResponse> response) {

            }

            @Override
            public void onFailure(Call<CheckCredentialsResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
