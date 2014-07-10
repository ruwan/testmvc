/**
 * 
 */
package com.mobitel.profmgt.domain;

/**
 * @author ruwands
 *
 */
public class Qualifications {
	private int year;
	private String institute;
	private String courseName;
	private boolean isHighestQualification;
	private String type;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public boolean isHighestQualification() {
		return isHighestQualification;
	}
	public void setHighestQualification(boolean isHighestQualification) {
		this.isHighestQualification = isHighestQualification;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
