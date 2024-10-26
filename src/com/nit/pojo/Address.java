package com.nit.pojo;

public class Address {
	private String street;
	private String state;
	private int pincode;
	public Address() {
		
	}
	public Address(String street, String state, int pincode) {
		System.out.println("Constuctor calling");
		this.street = street;
		this.state = state;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [Street=" + street + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
