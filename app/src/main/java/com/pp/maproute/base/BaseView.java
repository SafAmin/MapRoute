package com.pp.maproute.base;

/**
 * Created by Safa Amin on 22/03/2019.
 */
public interface BaseView {

    void showLoadingIndicator();

    void hideLoadingIndicator();

    void handleOfflineError();

    BasePresenter getPresenter();
}
