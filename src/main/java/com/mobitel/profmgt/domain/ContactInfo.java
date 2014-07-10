package com.mobitel.profmgt.domain;

public class ContactInfo {
	private String contactType;
	private String mobileNo;
	private String telephoneNo;
	private String email;
	private String facebookProfile;
	private String linkedInProfile;
	private String twitterProfile;
	
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacebookProfile() {
		return facebookProfile;
	}
	public void setFacebookProfile(String facebookProfile) {
		this.facebookProfile = facebookProfile;
	}
	public String getLinkedInProfile() {
		return linkedInProfile;
	}
	public void setLinkedInProfile(String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}
	public String getTwitterProfile() {
		return twitterProfile;
	}
	public void setTwitterProfile(String twitterProfile) {
		this.twitterProfile = twitterProfile;
	}
	
}
