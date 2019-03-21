package com.pp.maproute.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class UsersItem implements Parcelable {

	@SerializedName("bus")
	private Bus bus;

	@SerializedName("BusId")
	private int busId;

	@SerializedName("Organization")
	private Organization organization;

	@SerializedName("checkIOOrg")
	private int checkIOOrg;

	@SerializedName("CheckInLocation")
	private String checkInLocation;

	@SerializedName("roles")
	private List<RolesItem> roles;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("Gender")
	private int gender;

	@SerializedName("OrganizationId")
	private int organizationId;

	@SerializedName("hasAttendedBack")
	private boolean hasAttendedBack;

	@SerializedName("PhotoLink")
	private String photoLink;

	@SerializedName("HasBus")
	private boolean hasBus;

	@SerializedName("identification")
	private String identification;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("role_id")
	private int roleId;

	@SerializedName("CheckOutLocation")
	private String checkOutLocation;

	@SerializedName("id")
	private int id;

	@SerializedName("PhotoUrl")
	private String photoUrl;

	@SerializedName("hasAttended")
	private boolean hasAttended;

	@SerializedName("email")
	private String email;

	@SerializedName("Age")
	private int age;

	@SerializedName("MobileNo")
	private String mobileNo;

	@SerializedName("hasAttendedBySupervisor")
	private boolean hasAttendedBySupervisor;

	@SerializedName("hasCheckedOut")
	private boolean hasCheckedOut;

	@SerializedName("stopPointId")
	private int stopPointId;

	@SerializedName("hasAttendedBackBySupervisor")
	private boolean hasAttendedBackBySupervisor;

	@SerializedName("fullName")
	private String fullName;

	@SerializedName("stopPointIdBack")
	private int stopPointIdBack;

	@SerializedName("tempStatus")
	private int tempStatus;

	@SerializedName("name")
	private String name;

	@SerializedName("isLoggedIn")
	private int isLoggedIn;

	@SerializedName("connectionId")
	private String connectionId;

	@SerializedName("position")
	private String position;

	@SerializedName("hasCheckedIn")
	private boolean hasCheckedIn;

	@SerializedName("Location")
	private String location;

	@SerializedName("hasArrivedBySupervisor")
	private boolean hasArrivedBySupervisor;

	public void setBus(Bus bus){
		this.bus = bus;
	}

	public Bus getBus(){
		return bus;
	}

	public void setBusId(int busId){
		this.busId = busId;
	}

	public int getBusId(){
		return busId;
	}

	public void setOrganization(Organization organization){
		this.organization = organization;
	}

	public Organization getOrganization(){
		return organization;
	}

	public void setCheckIOOrg(int checkIOOrg){
		this.checkIOOrg = checkIOOrg;
	}

	public int getCheckIOOrg(){
		return checkIOOrg;
	}

	public void setCheckInLocation(String checkInLocation){
		this.checkInLocation = checkInLocation;
	}

	public String getCheckInLocation(){
		return checkInLocation;
	}

	public void setRoles(List<RolesItem> roles){
		this.roles = roles;
	}

	public List<RolesItem> getRoles(){
		return roles;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setGender(int gender){
		this.gender = gender;
	}

	public int getGender(){
		return gender;
	}

	public void setOrganizationId(int organizationId){
		this.organizationId = organizationId;
	}

	public int getOrganizationId(){
		return organizationId;
	}

	public void setHasAttendedBack(boolean hasAttendedBack){
		this.hasAttendedBack = hasAttendedBack;
	}

	public boolean isHasAttendedBack(){
		return hasAttendedBack;
	}

	public void setPhotoLink(String photoLink){
		this.photoLink = photoLink;
	}

	public String getPhotoLink(){
		return photoLink;
	}

	public void setHasBus(boolean hasBus){
		this.hasBus = hasBus;
	}

	public boolean isHasBus(){
		return hasBus;
	}

	public void setIdentification(String identification){
		this.identification = identification;
	}

	public String getIdentification(){
		return identification;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setRoleId(int roleId){
		this.roleId = roleId;
	}

	public int getRoleId(){
		return roleId;
	}

	public void setCheckOutLocation(String checkOutLocation){
		this.checkOutLocation = checkOutLocation;
	}

	public String getCheckOutLocation(){
		return checkOutLocation;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPhotoUrl(String photoUrl){
		this.photoUrl = photoUrl;
	}

	public String getPhotoUrl(){
		return photoUrl;
	}

	public void setHasAttended(boolean hasAttended){
		this.hasAttended = hasAttended;
	}

	public boolean isHasAttended(){
		return hasAttended;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}

	public String getMobileNo(){
		return mobileNo;
	}

	public void setHasAttendedBySupervisor(boolean hasAttendedBySupervisor){
		this.hasAttendedBySupervisor = hasAttendedBySupervisor;
	}

	public boolean isHasAttendedBySupervisor(){
		return hasAttendedBySupervisor;
	}

	public void setHasCheckedOut(boolean hasCheckedOut){
		this.hasCheckedOut = hasCheckedOut;
	}

	public boolean isHasCheckedOut(){
		return hasCheckedOut;
	}

	public void setStopPointId(int stopPointId){
		this.stopPointId = stopPointId;
	}

	public int getStopPointId(){
		return stopPointId;
	}

	public void setHasAttendedBackBySupervisor(boolean hasAttendedBackBySupervisor){
		this.hasAttendedBackBySupervisor = hasAttendedBackBySupervisor;
	}

	public boolean isHasAttendedBackBySupervisor(){
		return hasAttendedBackBySupervisor;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setStopPointIdBack(int stopPointIdBack){
		this.stopPointIdBack = stopPointIdBack;
	}

	public int getStopPointIdBack(){
		return stopPointIdBack;
	}

	public void setTempStatus(int tempStatus){
		this.tempStatus = tempStatus;
	}

	public int getTempStatus(){
		return tempStatus;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIsLoggedIn(int isLoggedIn){
		this.isLoggedIn = isLoggedIn;
	}

	public int getIsLoggedIn(){
		return isLoggedIn;
	}

	public void setConnectionId(String connectionId){
		this.connectionId = connectionId;
	}

	public String getConnectionId(){
		return connectionId;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return position;
	}

	public void setHasCheckedIn(boolean hasCheckedIn){
		this.hasCheckedIn = hasCheckedIn;
	}

	public boolean isHasCheckedIn(){
		return hasCheckedIn;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	public void setHasArrivedBySupervisor(boolean hasArrivedBySupervisor){
		this.hasArrivedBySupervisor = hasArrivedBySupervisor;
	}

	public boolean isHasArrivedBySupervisor(){
		return hasArrivedBySupervisor;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.bus, flags);
		dest.writeInt(this.busId);
		dest.writeParcelable(this.organization, flags);
		dest.writeInt(this.checkIOOrg);
		dest.writeString(this.checkInLocation);
		dest.writeTypedList(this.roles);
		dest.writeString(this.createdAt);
		dest.writeInt(this.gender);
		dest.writeInt(this.organizationId);
		dest.writeByte(this.hasAttendedBack ? (byte) 1 : (byte) 0);
		dest.writeString(this.photoLink);
		dest.writeByte(this.hasBus ? (byte) 1 : (byte) 0);
		dest.writeString(this.identification);
		dest.writeString(this.updatedAt);
		dest.writeInt(this.roleId);
		dest.writeString(this.checkOutLocation);
		dest.writeInt(this.id);
		dest.writeString(this.photoUrl);
		dest.writeByte(this.hasAttended ? (byte) 1 : (byte) 0);
		dest.writeString(this.email);
		dest.writeInt(this.age);
		dest.writeString(this.mobileNo);
		dest.writeByte(this.hasAttendedBySupervisor ? (byte) 1 : (byte) 0);
		dest.writeByte(this.hasCheckedOut ? (byte) 1 : (byte) 0);
		dest.writeInt(this.stopPointId);
		dest.writeByte(this.hasAttendedBackBySupervisor ? (byte) 1 : (byte) 0);
		dest.writeString(this.fullName);
		dest.writeInt(this.stopPointIdBack);
		dest.writeInt(this.tempStatus);
		dest.writeString(this.name);
		dest.writeInt(this.isLoggedIn);
		dest.writeString(this.connectionId);
		dest.writeString(this.position);
		dest.writeByte(this.hasCheckedIn ? (byte) 1 : (byte) 0);
		dest.writeString(this.location);
		dest.writeByte(this.hasArrivedBySupervisor ? (byte) 1 : (byte) 0);
	}

	public UsersItem() {
	}

	protected UsersItem(Parcel in) {
		this.bus = in.readParcelable(Bus.class.getClassLoader());
		this.busId = in.readInt();
		this.organization = in.readParcelable(Organization.class.getClassLoader());
		this.checkIOOrg = in.readInt();
		this.checkInLocation = in.readString();
		this.roles = in.createTypedArrayList(RolesItem.CREATOR);
		this.createdAt = in.readString();
		this.gender = in.readInt();
		this.organizationId = in.readInt();
		this.hasAttendedBack = in.readByte() != 0;
		this.photoLink = in.readString();
		this.hasBus = in.readByte() != 0;
		this.identification = in.readString();
		this.updatedAt = in.readString();
		this.roleId = in.readInt();
		this.checkOutLocation = in.readString();
		this.id = in.readInt();
		this.photoUrl = in.readString();
		this.hasAttended = in.readByte() != 0;
		this.email = in.readString();
		this.age = in.readInt();
		this.mobileNo = in.readString();
		this.hasAttendedBySupervisor = in.readByte() != 0;
		this.hasCheckedOut = in.readByte() != 0;
		this.stopPointId = in.readInt();
		this.hasAttendedBackBySupervisor = in.readByte() != 0;
		this.fullName = in.readString();
		this.stopPointIdBack = in.readInt();
		this.tempStatus = in.readInt();
		this.name = in.readString();
		this.isLoggedIn = in.readInt();
		this.connectionId = in.readString();
		this.position = in.readString();
		this.hasCheckedIn = in.readByte() != 0;
		this.location = in.readString();
		this.hasArrivedBySupervisor = in.readByte() != 0;
	}

	public static final Creator<UsersItem> CREATOR = new Creator<UsersItem>() {
		@Override
		public UsersItem createFromParcel(Parcel source) {
			return new UsersItem(source);
		}

		@Override
		public UsersItem[] newArray(int size) {
			return new UsersItem[size];
		}
	};
}