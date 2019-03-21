package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class StopPointsItem implements Parcelable {

	@SerializedName("stopPointId")
	private int stopPointId;

	@SerializedName("lng")
	private double lng;

	@SerializedName("southWest_lng")
	private double southWestLng;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("users")
	private List<UsersItem> users;

	@SerializedName("users_back")
	private List<Object> usersBack;

	@SerializedName("northEast_lng")
	private double northEastLng;

	@SerializedName("routeId")
	private int routeId;

	@SerializedName("minsfromprevious")
	private int minsfromprevious;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("southWest_lat")
	private double southWestLat;

	@SerializedName("Id")
	private int id;

	@SerializedName("northEast_lat")
	private double northEastLat;

	@SerializedName("lat")
	private double lat;

	@SerializedName("direction")
	private int direction;

	public void setStopPointId(int stopPointId){
		this.stopPointId = stopPointId;
	}

	public int getStopPointId(){
		return stopPointId;
	}

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setSouthWestLng(double southWestLng){
		this.southWestLng = southWestLng;
	}

	public double getSouthWestLng(){
		return southWestLng;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setUsers(List<UsersItem> users){
		this.users = users;
	}

	public List<UsersItem> getUsers(){
		return users;
	}

	public void setUsersBack(List<Object> usersBack){
		this.usersBack = usersBack;
	}

	public List<Object> getUsersBack(){
		return usersBack;
	}

	public void setNorthEastLng(double northEastLng){
		this.northEastLng = northEastLng;
	}

	public double getNorthEastLng(){
		return northEastLng;
	}

	public void setRouteId(int routeId){
		this.routeId = routeId;
	}

	public int getRouteId(){
		return routeId;
	}

	public void setMinsfromprevious(int minsfromprevious){
		this.minsfromprevious = minsfromprevious;
	}

	public int getMinsfromprevious(){
		return minsfromprevious;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
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

	public void setDirection(int direction){
		this.direction = direction;
	}

	public int getDirection(){
		return direction;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(this.stopPointId);
		dest.writeDouble(this.lng);
		dest.writeDouble(this.southWestLng);
		dest.writeString(this.createdAt);
		dest.writeList(this.users);
		dest.writeList(this.usersBack);
		dest.writeDouble(this.northEastLng);
		dest.writeInt(this.routeId);
		dest.writeInt(this.minsfromprevious);
		dest.writeString(this.updatedAt);
		dest.writeDouble(this.southWestLat);
		dest.writeInt(this.id);
		dest.writeDouble(this.northEastLat);
		dest.writeDouble(this.lat);
		dest.writeInt(this.direction);
	}

	public StopPointsItem() {
	}

	protected StopPointsItem(Parcel in) {
		this.stopPointId = in.readInt();
		this.lng = in.readDouble();
		this.southWestLng = in.readDouble();
		this.createdAt = in.readString();
		this.users = new ArrayList<UsersItem>();
		in.readList(this.users, UsersItem.class.getClassLoader());
		this.usersBack = new ArrayList<Object>();
		in.readList(this.usersBack, Object.class.getClassLoader());
		this.northEastLng = in.readDouble();
		this.routeId = in.readInt();
		this.minsfromprevious = in.readInt();
		this.updatedAt = in.readString();
		this.southWestLat = in.readDouble();
		this.id = in.readInt();
		this.northEastLat = in.readDouble();
		this.lat = in.readDouble();
		this.direction = in.readInt();
	}

	public static final Creator<StopPointsItem> CREATOR = new Creator<StopPointsItem>() {
		@Override
		public StopPointsItem createFromParcel(Parcel source) {
			return new StopPointsItem(source);
		}

		@Override
		public StopPointsItem[] newArray(int size) {
			return new StopPointsItem[size];
		}
	};
}