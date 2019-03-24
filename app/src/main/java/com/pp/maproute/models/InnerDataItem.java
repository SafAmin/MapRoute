package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class InnerDataItem implements Parcelable {

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("Id")
    private int id;

    @SerializedName("content")
    private String content;

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
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

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return
                "InnerDataItem{" +
                        "updated_at = '" + updatedAt + '\'' +
                        ",created_at = '" + createdAt + '\'' +
                        ",id = '" + id + '\'' +
                        ",content = '" + content + '\'' +
                        "}";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.updatedAt);
        dest.writeString(this.createdAt);
        dest.writeInt(this.id);
        dest.writeString(this.content);
    }

    public InnerDataItem() {
    }

    protected InnerDataItem(Parcel in) {
        this.updatedAt = in.readString();
        this.createdAt = in.readString();
        this.id = in.readInt();
        this.content = in.readString();
    }

    public static final Creator<InnerDataItem> CREATOR = new Creator<InnerDataItem>() {
        @Override
        public InnerDataItem createFromParcel(Parcel source) {
            return new InnerDataItem(source);
        }

        @Override
        public InnerDataItem[] newArray(int size) {
            return new InnerDataItem[size];
        }
    };
}