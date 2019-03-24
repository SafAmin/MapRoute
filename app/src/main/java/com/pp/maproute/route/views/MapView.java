package com.pp.maproute.route.views;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.pp.maproute.R;
import com.pp.maproute.models.RoutePathItem;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;

/**
 * Created by Safa Amin on 22/03/2019.
 */
public class MapView extends FrameLayout {

    private Subject<GoogleMap> mapSubject;
    private double latitude, longitude, latitudeZoom, longitudeZoom;

    public MapView(@NonNull Context context) {
        super(context);
        init(context, null);
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attrs,
                   @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        SupportMapFragment mapFragment = SupportMapFragment.newInstance();

        if (!isInEditMode()) {
            FragmentTransaction fragmentTransaction =
                    ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(getId(), mapFragment);
            fragmentTransaction.commit();


            mapSubject = BehaviorSubject.create();
            Observable.create(
                    (ObservableOnSubscribe<GoogleMap>) e -> mapFragment.getMapAsync(value -> e.onNext(value)))
                    .subscribe(mapSubject);
        }
    }

    public void drawRoute(List<RoutePathItem> pointsList) {
        mapSubject.subscribe(googleMap -> {
            LatLng[] latlngarray = new LatLng[pointsList.size()];
            for (int i = 0; i < pointsList.size(); i++) {
                latitude = pointsList.get(i).getLat();
                if (latitude == 0) {
                    Log.i("debug", "latitude null");
                }
                longitude = pointsList.get(i).getLng();
                googleMap.addMarker(new MarkerOptions().position(new LatLng(latitude, longitude)));
                latlngarray[i] = new LatLng(latitude, longitude);
            }
            PolylineOptions routeDraw = new PolylineOptions().add(latlngarray).width(5).color(getContext().getResources().getColor(R.color.colorPrimaryDark));
            Polyline polyline = googleMap.addPolyline(routeDraw);
            latitudeZoom = pointsList.get(0).getLat();
            longitudeZoom = pointsList.get(0).getLng();
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitudeZoom, longitudeZoom), 14));
            if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            googleMap.setMyLocationEnabled(true);
        });
    }
}