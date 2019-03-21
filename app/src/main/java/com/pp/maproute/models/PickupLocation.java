package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class PickupLocation implements Parcelable {

	@SerializedName("lng")
	private double lng;

	@SerializedName("lat")
	private double lat;

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeDouble(this.lng);
		dest.writeDouble(this.lat);
	}

	public PickupLocation() {
	}

	protected PickupLocation(Parcel in) {
		this.lng = in.readDouble();
		this.lat = in.readDouble();
	}

	public static final Creator<PickupLocation> CREATOR = new Creator<PickupLocation>() {
		@Override
		public PickupLocation createFromParcel(Parcel source) {
			return new PickupLocation(source);
		}

		@Override
		public PickupLocation[] newArray(int size) {
			return new PickupLocation[size];
		}
	};
}