package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class RoutePathItem implements Parcelable {

    @SerializedName("lng")
    private double lng;

    @SerializedName("lat")
    private double lat;

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLng() {
        return lng;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLat() {
        return lat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.lng);
        dest.writeDouble(this.lat);
    }

    public RoutePathItem() {
    }

    protected RoutePathItem(Parcel in) {
        this.lng = in.readDouble();
        this.lat = in.readDouble();
    }

    public static final Creator<RoutePathItem> CREATOR = new Creator<RoutePathItem>() {
        @Override
        public RoutePathItem createFromParcel(Parcel source) {
            return new RoutePathItem(source);
        }

        @Override
        public RoutePathItem[] newArray(int size) {
            return new RoutePathItem[size];
        }
    };
}