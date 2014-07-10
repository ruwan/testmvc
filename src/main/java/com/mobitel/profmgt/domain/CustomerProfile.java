/**
 * 
 */
package com.mobitel.profmgt.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author ruwands
 *
 */
public class CustomerProfile {
	private int profileId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dob;
	private String gender;
	private String honorifics;
	private String nic;
	private String occupation;
	private String remarks;
	private Date addedDate;
	private Date removedDate;
	private String addedBy;
	private String removedBy;
	
	private ArrayList<AddressInfo> lstAddress;
	private ArrayList<ContactInfo> lstContactInfo;
	private ArrayList<Qualifications> lstQualification;
	private ArrayList<EventInfo> lstParticipatedEvent;
	
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHonorifics() {
		return honorifics;
	}
	public void setHonorifics(String honorifics) {
		this.honorifics = honorifics;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public Date getRemovedDate() {
		return removedDate;
	}
	public void setRemovedDate(Date removedDate) {
		this.removedDate = removedDate;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public String getRemovedBy() {
		return removedBy;
	}
	public void setRemovedBy(String removedBy) {
		this.removedBy = removedBy;
	}
	public ArrayList<AddressInfo> getLstAddress() {
		return lstAddress;
	}
	public void setLstAddress(ArrayList<AddressInfo> lstAddress) {
		this.lstAddress = lstAddress;
	}
	public ArrayList<ContactInfo> getLstContactInfo() {
		return lstContactInfo;
	}
	public void setLstContactInfo(ArrayList<ContactInfo> lstContactInfo) {
		this.lstContactInfo = lstContactInfo;
	}
	public ArrayList<Qualifications> getLstQualification() {
		return lstQualification;
	}
	public void setLstQualification(ArrayList<Qualifications> lstQualification) {
		this.lstQualification = lstQualification;
	}
	
}
