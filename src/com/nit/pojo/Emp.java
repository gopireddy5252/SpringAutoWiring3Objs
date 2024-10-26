package com.nit.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Emp {
	private int eid;
	private String ename;
	private int sal;
	// using Annotation we can directly inject the address object into the employee object
	@Autowired
	@Qualifier("AddressId2")// if u want first Address then give that id 
	private Address address;
	
	@Autowired
	private Colleagues colleagues;
	public Emp() {
		
	}
	public Emp(int eid, String ename, int sal, Address address) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public Colleagues getColleagues()
	{
		return colleagues;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", address=" + address + ",Colleagues= "
				+ ""+colleagues+"]";
	}
	
}
