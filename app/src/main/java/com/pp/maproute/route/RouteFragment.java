package com.pp.maproute.route;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.pp.maproute.R;
import com.pp.maproute.base.BaseFragment;
import com.pp.maproute.models.RoutePathItem;
import com.pp.maproute.route.views.AboutUsView;
import com.pp.maproute.route.views.MapView;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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

    @OnClick(R.id.iv_about_us)
    public void onClickAboutUs() {
        presenter.executeAboutUsService();
    }

    @Override
    public void invalidateAboutUsDialog(String aboutUsContent) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);
        DialogFragment dialogFragment = new AboutUsView();
        Bundle bundle = new Bundle();
        bundle.putString("ABOUT_US_CONTENT", aboutUsContent);
        dialogFragment.setArguments(bundle);
        dialogFragment.show(ft, "dialog");
    }

    @Override
    public void invalidateMapWithRoute(List<RoutePathItem> routePathList) {
        mapContainer.setVisibility(View.VISIBLE);
        mapContainer.drawRoute(routePathList);
    }

    @Override
    public void handleError(String m) {
        Toast.makeText(getActivity(), checkCredentialsError + m, Toast.LENGTH_SHORT).show();
    }

    @Override
    public RoutePresenter getPresenter() {
        return presenter;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
