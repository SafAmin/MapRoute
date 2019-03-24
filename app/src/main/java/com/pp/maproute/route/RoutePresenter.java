package com.pp.maproute.route;


import com.pp.maproute.base.BasePresenter;
import com.pp.maproute.models.AboutUsResponse;
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
class RoutePresenter extends BasePresenter<RouteView> {

    private String token;

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
                token = response.body().getInnerData().getToken();
                getView().invalidateMapWithRoute(response.body().getInnerData().getUser().getBus().
                        getRoute().getRoutePath());

            }

            @Override
            public void onFailure(Call<CheckCredentialsResponse> call, Throwable t) {
                getView().hideLoadingIndicator();

                getView().handleError(t.getMessage());
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

    void executeAboutUsService() {
        getView().showLoadingIndicator();
        MapRouteServices service = MapRouteClient.getRetrofitInstance().create(MapRouteServices.class);
        Call<AboutUsResponse> call = service.getAboutUsContent("http://inaclick.online/mtc/aboutus/aboutUs",
                token);

        call.enqueue(new Callback<AboutUsResponse>() {
            @Override
            public void onResponse(Call<AboutUsResponse> call,
                                   Response<AboutUsResponse> response) {
                getView().hideLoadingIndicator();
                getView().invalidateAboutUsDialog(response.body().getInnerData().get(0).getContent());
            }

            @Override
            public void onFailure(Call<AboutUsResponse> call, Throwable t) {
                getView().hideLoadingIndicator();
                getView().handleError(t.getMessage());
            }
        });
    }
}
