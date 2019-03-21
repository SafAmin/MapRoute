package com.pp.maproute.route;

import com.pp.maproute.base.BaseView;
import com.pp.maproute.models.RoutePathItem;

import java.util.List;

/**
 * Created by Safa Amin on 22/03/2019.
 */
public interface RouteView extends BaseView {

    void invalidateMapWithRoute(List<RoutePathItem> routePathList);

    void handleError();
}
