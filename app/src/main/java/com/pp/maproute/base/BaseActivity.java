package com.pp.maproute.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.pp.maproute.R;
import com.pp.maproute.route.RouteFragment;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Safa Amin on 22/03/2019.
 */
public class BaseActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindString(R.string.screen_title)
    String screenTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setScreenTitle(screenTitle);

        invalidateView(RouteFragment.getInstance());
    }

    public void setScreenTitle(String title) {
        toolbar.setTitle(title);
    }

    public void invalidateView(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.layout_placeholder, fragment);
        fragmentTransaction.commit();
    }
}