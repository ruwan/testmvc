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
public class EventType {
	private String name;
	private String description;
	private Date removedDate;
	private String removedBy;
	
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
	public Date getRemovedDate() {
		return removedDate;
	}
	public void setRemovedDate(Date removedDate) {
		this.removedDate = removedDate;
	}
	public String getRemovedBy() {
		return removedBy;
	}
	public void setRemovedBy(String removedBy) {
		this.removedBy = removedBy;
	}
	
	
	
}
