package com.pp.maproute.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AboutUsResponse {

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
}