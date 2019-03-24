package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class InnerData implements Parcelable {

    @SerializedName("user")
    private User user;

    @SerializedName("token")
    private String token;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, flags);
        dest.writeString(this.token);
    }

    public InnerData() {
    }

    protected InnerData(Parcel in) {
        this.user = in.readParcelable(User.class.getClassLoader());
        this.token = in.readString();
    }

    public static final Creator<InnerData> CREATOR = new Creator<InnerData>() {
        @Override
        public InnerData createFromParcel(Parcel source) {
            return new InnerData(source);
        }

        @Override
        public InnerData[] newArray(int size) {
            return new InnerData[size];
        }
    };
}