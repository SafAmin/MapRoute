package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Route implements Parcelable {

    @SerializedName("dropoffLocationBack")
    private DropoffLocationBack dropoffLocationBack;

    @SerializedName("routePath")
    private List<RoutePathItem> routePath;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("routePathBack")
    private List<RoutePathBackItem> routePathBack;

    @SerializedName("name")
    private String name;

    @SerializedName("dropoffLocation")
    private DropoffLocation dropoffLocation;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("Id")
    private int id;

    @SerializedName("pickupLocation")
    private PickupLocation pickupLocation;

    @SerializedName("timeToDest")
    private int timeToDest;

    @SerializedName("pickupLocationBack")
    private PickupLocationBack pickupLocationBack;

    @SerializedName("stop_points")
    private List<StopPointsItem> stopPoints;

    public void setDropoffLocationBack(DropoffLocationBack dropoffLocationBack) {
        this.dropoffLocationBack = dropoffLocationBack;
    }

    public DropoffLocationBack getDropoffLocationBack() {
        return dropoffLocationBack;
    }

    public void setRoutePath(List<RoutePathItem> routePath) {
        this.routePath = routePath;
    }

    public List<RoutePathItem> getRoutePath() {
        return routePath;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setRoutePathBack(List<RoutePathBackItem> routePathBack) {
        this.routePathBack = routePathBack;
    }

    public List<RoutePathBackItem> getRoutePathBack() {
        return routePathBack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDropoffLocation(DropoffLocation dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }

    public DropoffLocation getDropoffLocation() {
        return dropoffLocation;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPickupLocation(PickupLocation pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public PickupLocation getPickupLocation() {
        return pickupLocation;
    }

    public void setTimeToDest(int timeToDest) {
        this.timeToDest = timeToDest;
    }

    public int getTimeToDest() {
        return timeToDest;
    }

    public void setPickupLocationBack(PickupLocationBack pickupLocationBack) {
        this.pickupLocationBack = pickupLocationBack;
    }

    public PickupLocationBack getPickupLocationBack() {
        return pickupLocationBack;
    }

    public void setStopPoints(List<StopPointsItem> stopPoints) {
        this.stopPoints = stopPoints;
    }

    public List<StopPointsItem> getStopPoints() {
        return stopPoints;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.dropoffLocationBack, flags);
        dest.writeList(this.routePath);
        dest.writeString(this.updatedAt);
        dest.writeList(this.routePathBack);
        dest.writeString(this.name);
        dest.writeParcelable(this.dropoffLocation, flags);
        dest.writeString(this.createdAt);
        dest.writeInt(this.id);
        dest.writeParcelable(this.pickupLocation, flags);
        dest.writeInt(this.timeToDest);
        dest.writeParcelable(this.pickupLocationBack, flags);
        dest.writeList(this.stopPoints);
    }

    public Route() {
    }

    protected Route(Parcel in) {
        this.dropoffLocationBack = in.readParcelable(DropoffLocationBack.class.getClassLoader());
        this.routePath = new ArrayList<RoutePathItem>();
        in.readList(this.routePath, RoutePathItem.class.getClassLoader());
        this.updatedAt = in.readString();
        this.routePathBack = new ArrayList<RoutePathBackItem>();
        in.readList(this.routePathBack, RoutePathBackItem.class.getClassLoader());
        this.name = in.readString();
        this.dropoffLocation = in.readParcelable(DropoffLocation.class.getClassLoader());
        this.createdAt = in.readString();
        this.id = in.readInt();
        this.pickupLocation = in.readParcelable(PickupLocation.class.getClassLoader());
        this.timeToDest = in.readInt();
        this.pickupLocationBack = in.readParcelable(PickupLocationBack.class.getClassLoader());
        this.stopPoints = new ArrayList<StopPointsItem>();
        in.readList(this.stopPoints, StopPointsItem.class.getClassLoader());
    }

    public static final Creator<Route> CREATOR = new Creator<Route>() {
        @Override
        public Route createFromParcel(Parcel source) {
            return new Route(source);
        }

        @Override
        public Route[] newArray(int size) {
            return new Route[size];
        }
    };
}