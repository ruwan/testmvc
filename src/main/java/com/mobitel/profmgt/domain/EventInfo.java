/**
 * 
 */
package com.mobitel.profmgt.domain;

import java.util.Date;

/**
 * @author ruwands
 *
 */
public class EventInfo {
	private String name;
	private String description;
	private EventType eventType;
	private String location;
	private String organizedBy;
	private String facilitatedBy;
	private Date eventDate;
	private String addedBy;
	private Date addedDate;
	private String removedBy;
	private Date removedDate;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOrganizedBy() {
		return organizedBy;
	}
	public void setOrganizedBy(String organizedBy) {
		this.organizedBy = organizedBy;
	}
	public String getFacilitatedBy() {
		return facilitatedBy;
	}
	public void setFacilitatedBy(String facilitatedBy) {
		this.facilitatedBy = facilitatedBy;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public String getRemovedBy() {
		return removedBy;
	}
	public void setRemovedBy(String removedBy) {
		this.removedBy = removedBy;
	}
	public Date getRemovedDate() {
		return removedDate;
	}
	public void setRemovedDate(Date removedDate) {
		this.removedDate = removedDate;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
