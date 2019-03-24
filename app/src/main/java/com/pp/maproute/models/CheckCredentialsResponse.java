package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class CheckCredentialsResponse implements Parcelable {

    @SerializedName("Status")
    private boolean status;

    @SerializedName("InnerData")
    private InnerData innerData;

    @SerializedName("Message")
    private String message;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setInnerData(InnerData innerData) {
        this.innerData = innerData;
    }

    public InnerData getInnerData() {
        return innerData;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.status ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.innerData, flags);
        dest.writeString(this.message);
    }

    public CheckCredentialsResponse() {
    }

    protected CheckCredentialsResponse(Parcel in) {
        this.status = in.readByte() != 0;
        this.innerData = in.readParcelable(InnerData.class.getClassLoader());
        this.message = in.readString();
    }

    public static final Creator<CheckCredentialsResponse> CREATOR = new Creator<CheckCredentialsResponse>() {
        @Override
        public CheckCredentialsResponse createFromParcel(Parcel source) {
            return new CheckCredentialsResponse(source);
        }

        @Override
        public CheckCredentialsResponse[] newArray(int size) {
            return new CheckCredentialsResponse[size];
        }
    };
}