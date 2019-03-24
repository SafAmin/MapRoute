package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Bus implements Parcelable {

    @SerializedName("isactive")
    private int isactive;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("supervisorId")
    private int supervisorId;

    @SerializedName("users")
    private List<UsersItem> users;

    @SerializedName("busNumber")
    private String busNumber;

    @SerializedName("capacity")
    private int capacity;

    @SerializedName("organizationId")
    private int organizationId;

    @SerializedName("routeId")
    private int routeId;

    @SerializedName("route")
    private Route route;

    @SerializedName("driverId")
    private int driverId;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("driver")
    private Driver driver;

    @SerializedName("organization")
    private Organization organization;

    @SerializedName("Id")
    private int id;

    @SerializedName("supervisor")
    private Supervisor supervisor;

    public void setIsactive(int isactive) {
        this.isactive = isactive;
    }

    public int getIsactive() {
        return isactive;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setUsers(List<UsersItem> users) {
        this.users = users;
    }

    public List<UsersItem> getUsers() {
        return users;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Route getRoute() {
        return route;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.isactive);
        dest.writeString(this.createdAt);
        dest.writeInt(this.supervisorId);
        dest.writeList(this.users);
        dest.writeString(this.busNumber);
        dest.writeInt(this.capacity);
        dest.writeInt(this.organizationId);
        dest.writeInt(this.routeId);
        dest.writeParcelable(this.route, flags);
        dest.writeInt(this.driverId);
        dest.writeString(this.updatedAt);
        dest.writeParcelable(this.driver, flags);
        dest.writeParcelable(this.organization, flags);
        dest.writeInt(this.id);
        dest.writeParcelable(this.supervisor, flags);
    }

    public Bus() {
    }

    protected Bus(Parcel in) {
        this.isactive = in.readInt();
        this.createdAt = in.readString();
        this.supervisorId = in.readInt();
        this.users = new ArrayList<UsersItem>();
        in.readList(this.users, UsersItem.class.getClassLoader());
        this.busNumber = in.readString();
        this.capacity = in.readInt();
        this.organizationId = in.readInt();
        this.routeId = in.readInt();
        this.route = in.readParcelable(Route.class.getClassLoader());
        this.driverId = in.readInt();
        this.updatedAt = in.readString();
        this.driver = in.readParcelable(Driver.class.getClassLoader());
        this.organization = in.readParcelable(Organization.class.getClassLoader());
        this.id = in.readInt();
        this.supervisor = in.readParcelable(Supervisor.class.getClassLoader());
    }

    public static final Creator<Bus> CREATOR = new Creator<Bus>() {
        @Override
        public Bus createFromParcel(Parcel source) {
            return new Bus(source);
        }

        @Override
        public Bus[] newArray(int size) {
            return new Bus[size];
        }
    };
}