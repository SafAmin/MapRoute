package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class RolesItem implements Parcelable {

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("pivot")
	private Pivot pivot;

	@SerializedName("id")
	private int id;

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setPivot(Pivot pivot){
		this.pivot = pivot;
	}

	public Pivot getPivot(){
		return pivot;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.updatedAt);
		dest.writeString(this.name);
		dest.writeString(this.createdAt);
		dest.writeParcelable(this.pivot, flags);
		dest.writeInt(this.id);
	}

	public RolesItem() {
	}

	protected RolesItem(Parcel in) {
		this.updatedAt = in.readString();
		this.name = in.readString();
		this.createdAt = in.readString();
		this.pivot = in.readParcelable(Pivot.class.getClassLoader());
		this.id = in.readInt();
	}

	public static final Creator<RolesItem> CREATOR = new Creator<RolesItem>() {
		@Override
		public RolesItem createFromParcel(Parcel source) {
			return new RolesItem(source);
		}

		@Override
		public RolesItem[] newArray(int size) {
			return new RolesItem[size];
		}
	};
}