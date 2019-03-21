package com.pp.maproute.route;


import com.pp.maproute.base.BasePresenter;
import com.pp.maproute.models.CheckCredentialsResponse;
import com.pp.maproute.models.DriverAccountBody;
import com.pp.maproute.network.MapRouteClient;
import com.pp.maproute.network.MapRouteServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Presenter of {@link RouteFragment}
 * <p>
 * Created by Safa Amin on 22/03/2019.
 */
public class RoutePresenter extends BasePresenter<RouteView> {

    RoutePresenter(RouteView view) {
        super(view);
    }

    void executeCheckCredentialsService() {
        getView().showLoadingIndicator();
        MapRouteServices service = MapRouteClient.getRetrofitInstance().create(MapRouteServices.class);
        Call<CheckCredentialsResponse> call = service.checkCredentials(getDriverParams());
        call.enqueue(new Callback<CheckCredentialsResponse>() {
            @Override
            public void onResponse(Call<CheckCredentialsResponse> call,
                                   Response<CheckCredentialsResponse> response) {
                getView().hideLoadingIndicator();

                getView().invalidateMapWithRoute(response.body().getInnerData().getUser().getBus().
                        getRoute().getRoutePath());

            }

            @Override
            public void onFailure(Call<CheckCredentialsResponse> call, Throwable t) {
                getView().hideLoadingIndicator();

                getView().handleError();
            }
        });
    }

    private DriverAccountBody getDriverParams() {
        DriverAccountBody driverAccountBody = new DriverAccountBody();
        driverAccountBody.setName("bola_d");
        driverAccountBody.setPassword("1234");
        driverAccountBody.setDeviceToken("");

        return driverAccountBody;
    }
}
