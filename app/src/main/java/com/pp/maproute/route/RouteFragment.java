package com.pp.maproute.route;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.pp.maproute.R;
import com.pp.maproute.base.BaseFragment;
import com.pp.maproute.models.RoutePathItem;
import com.pp.maproute.route.view.MapView;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Safa Amin on 22/03/2019.
 */
public class RouteFragment extends BaseFragment implements RouteView {

    @BindView(R.id.map_container)
    MapView mapContainer;
    @BindString(R.string.check_credentials_error)
    String checkCredentialsError;

    private RoutePresenter presenter;
    private Unbinder unbinder;

    public static RouteFragment getInstance() {
        return new RouteFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_route, parent, false);

        unbinder = ButterKnife.bind(this, view);
        presenter = new RoutePresenter(this);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        presenter.executeCheckCredentialsService();
    }

    @Override
    public void invalidateMapWithRoute(List<RoutePathItem> routePathList) {
        mapContainer.setVisibility(View.VISIBLE);
    }

    @Override
    public void handleError() {
        Toast.makeText(getActivity(), checkCredentialsError, Toast.LENGTH_SHORT).show();
    }

    @Override
    public RoutePresenter getPresenter() {
        return presenter;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        if(unbinder != null) {
            unbinder.unbind();
        }
    }
}
