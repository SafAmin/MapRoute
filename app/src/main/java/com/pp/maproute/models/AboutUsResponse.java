package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AboutUsResponse implements Parcelable {

    @SerializedName("Status")
    private boolean status;

    @SerializedName("InnerData")
    private List<InnerDataItem> innerData;

    @SerializedName("Message")
    private String message;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setInnerData(List<InnerDataItem> innerData) {
        this.innerData = innerData;
    }

    public List<InnerDataItem> getInnerData() {
        return innerData;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return
                "AboutUsResponse{" +
                        "status = '" + status + '\'' +
                        ",innerData = '" + innerData + '\'' +
                        ",message = '" + message + '\'' +
                        "}";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.status ? (byte) 1 : (byte) 0);
        dest.writeList(this.innerData);
        dest.writeString(this.message);
    }

    public AboutUsResponse() {
    }

    protected AboutUsResponse(Parcel in) {
        this.status = in.readByte() != 0;
        this.innerData = new ArrayList<InnerDataItem>();
        in.readList(this.innerData, InnerDataItem.class.getClassLoader());
        this.message = in.readString();
    }

    public static final Creator<AboutUsResponse> CREATOR = new Creator<AboutUsResponse>() {
        @Override
        public AboutUsResponse createFromParcel(Parcel source) {
            return new AboutUsResponse(source);
        }

        @Override
        public AboutUsResponse[] newArray(int size) {
            return new AboutUsResponse[size];
        }
    };
}