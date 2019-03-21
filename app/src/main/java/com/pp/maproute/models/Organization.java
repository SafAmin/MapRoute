package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Organization implements Parcelable {

	@SerializedName("lng")
	private double lng;

	@SerializedName("permitCheckIn")
	private int permitCheckIn;

	@SerializedName("southWest_lng")
	private double southWestLng;

	@SerializedName("phoneNumber2")
	private Object phoneNumber2;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("Name")
	private String name;

	@SerializedName("northEast_lng")
	private double northEastLng;

	@SerializedName("phoneNumber")
	private String phoneNumber;

	@SerializedName("driverAsSupervisor")
	private int driverAsSupervisor;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("BusesCount")
	private int busesCount;

	@SerializedName("UsersCount")
	private int usersCount;

	@SerializedName("southWest_lat")
	private double southWestLat;

	@SerializedName("Id")
	private int id;

	@SerializedName("northEast_lat")
	private double northEastLat;

	@SerializedName("lat")
	private double lat;

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setPermitCheckIn(int permitCheckIn){
		this.permitCheckIn = permitCheckIn;
	}

	public int getPermitCheckIn(){
		return permitCheckIn;
	}

	public void setSouthWestLng(double southWestLng){
		this.southWestLng = southWestLng;
	}

	public double getSouthWestLng(){
		return southWestLng;
	}

	public void setPhoneNumber2(Object phoneNumber2){
		this.phoneNumber2 = phoneNumber2;
	}

	public Object getPhoneNumber2(){
		return phoneNumber2;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setNorthEastLng(double northEastLng){
		this.northEastLng = northEastLng;
	}

	public double getNorthEastLng(){
		return northEastLng;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setDriverAsSupervisor(int driverAsSupervisor){
		this.driverAsSupervisor = driverAsSupervisor;
	}

	public int getDriverAsSupervisor(){
		return driverAsSupervisor;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setBusesCount(int busesCount){
		this.busesCount = busesCount;
	}

	public int getBusesCount(){
		return busesCount;
	}

	public void setUsersCount(int usersCount){
		this.usersCount = usersCount;
	}

	public int getUsersCount(){
		return usersCount;
	}

	public void setSouthWestLat(double southWestLat){
		this.southWestLat = southWestLat;
	}

	public double getSouthWestLat(){
		return southWestLat;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setNorthEastLat(double northEastLat){
		this.northEastLat = northEastLat;
	}

	public double getNorthEastLat(){
		return northEastLat;
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
		dest.writeInt(this.permitCheckIn);
		dest.writeDouble(this.southWestLng);
		dest.writeParcelable((Parcelable)this.phoneNumber2, flags);
		dest.writeString(this.createdAt);
		dest.writeString(this.name);
		dest.writeDouble(this.northEastLng);
		dest.writeString(this.phoneNumber);
		dest.writeInt(this.driverAsSupervisor);
		dest.writeString(this.updatedAt);
		dest.writeInt(this.busesCount);
		dest.writeInt(this.usersCount);
		dest.writeDouble(this.southWestLat);
		dest.writeInt(this.id);
		dest.writeDouble(this.northEastLat);
		dest.writeDouble(this.lat);
	}

	public Organization() {
	}

	protected Organization(Parcel in) {
		this.lng = in.readDouble();
		this.permitCheckIn = in.readInt();
		this.southWestLng = in.readDouble();
		this.phoneNumber2 = in.readParcelable(Object.class.getClassLoader());
		this.createdAt = in.readString();
		this.name = in.readString();
		this.northEastLng = in.readDouble();
		this.phoneNumber = in.readString();
		this.driverAsSupervisor = in.readInt();
		this.updatedAt = in.readString();
		this.busesCount = in.readInt();
		this.usersCount = in.readInt();
		this.southWestLat = in.readDouble();
		this.id = in.readInt();
		this.northEastLat = in.readDouble();
		this.lat = in.readDouble();
	}

	public static final Creator<Organization> CREATOR = new Creator<Organization>() {
		@Override
		public Organization createFromParcel(Parcel source) {
			return new Organization(source);
		}

		@Override
		public Organization[] newArray(int size) {
			return new Organization[size];
		}
	};
}