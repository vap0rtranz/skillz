/**
 * 
 */
package com.redhat.training;

/**
 * @author jupittma
 *
 */
public class TodoItem {
	
	private String item;
	private String status;
	
	public TodoItem (String item, String status) {
		
		/** Default constructor */
		this.item=item;
		this.status=status;
	}
	
	public TodoItem () {
		
	}
	
	public String getItem() {
		return item;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setItem(String item) {
		this.item=item;
	}
	
	public void setStatus(String status) {
		this.status=status;
	}
}
