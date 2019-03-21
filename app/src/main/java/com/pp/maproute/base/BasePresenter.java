package com.pp.maproute.base;

import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;

/**
 * Created by Safa Amin on 22/03/2019.
 */
public class BasePresenter<V extends BaseView> {

    private WeakReference<V> viewRef;

    public BasePresenter(V view) {
        attachView(view);
    }

    private void attachView(@NonNull V view) {
        viewRef = new WeakReference<>(view);
    }

    public V getView() {
        if (viewRef != null)
            return viewRef.get();
        else return null;
    }
}
