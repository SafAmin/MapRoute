package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Pivot implements Parcelable {

    @SerializedName("user_id")
    private int userId;

    @SerializedName("role_id")
    private int roleId;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getRoleId() {
        return roleId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.userId);
        dest.writeInt(this.roleId);
    }

    public Pivot() {
    }

    protected Pivot(Parcel in) {
        this.userId = in.readInt();
        this.roleId = in.readInt();
    }

    public static final Creator<Pivot> CREATOR = new Creator<Pivot>() {
        @Override
        public Pivot createFromParcel(Parcel source) {
            return new Pivot(source);
        }

        @Override
        public Pivot[] newArray(int size) {
            return new Pivot[size];
        }
    };
}