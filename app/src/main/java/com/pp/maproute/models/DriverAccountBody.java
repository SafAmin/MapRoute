package com.pp.maproute.models;

public class DriverAccountBody {

    private String name;
    private  String password;
    private String deviceToken;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
