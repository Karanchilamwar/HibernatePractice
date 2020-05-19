package org.karan.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	 private String street1;
	 private String street2;
	 private int pincode;
	 
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	 
	 
}
