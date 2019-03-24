package com.pp.maproute.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;

import com.pp.maproute.R;

/**
 * Parent class for all fragments
 * <p>
 * <p>
 * Created by Safa Amin on 22/03/2019.
 */
public abstract class BaseFragment extends Fragment implements BaseView {

    private ProgressDialog loadingIndicator;

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

    }

    @Override
    public void showLoadingIndicator() {
        loadingIndicator = new ProgressDialog(getActivity());
        loadingIndicator.setMessage(getString(R.string.progress_dialog_message));
        loadingIndicator.show();
        loadingIndicator.setCancelable(false);
        loadingIndicator.setCanceledOnTouchOutside(false);
    }

    @Override
    public void hideLoadingIndicator() {
        if (loadingIndicator != null) {
            loadingIndicator.dismiss();
        }
    }

    @Override
    public void handleOfflineError() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
