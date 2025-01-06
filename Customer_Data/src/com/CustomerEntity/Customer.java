package com.CustomerEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Cust_Info")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Cust_name;
	private String address;
	private String Cust_email;
	private String pan_no;
	private long adhar_no;
	private long mobile_no;

	public Customer() {
		
	}

	public Customer(int id, String cust_name, String address, String cust_email, String pan_no, long adhar_no,
			long mobile_no) {
		super();
		this.id = id;
		Cust_name = cust_name;
		this.address = address;
		Cust_email = cust_email;
		this.pan_no = pan_no;
		this.adhar_no = adhar_no;
		this.mobile_no = mobile_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCust_name() {
		return Cust_name;
	}

	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCust_email() {
		return Cust_email;
	}

	public void setCust_email(String cust_email) {
		Cust_email = cust_email;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public long getAdhar_no() {
		return adhar_no;
	}

	public void setAdhar_no(long adhar_no) {
		this.adhar_no = adhar_no;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", Cust_name=" + Cust_name + ", address=" + address + ", Cust_email=" + Cust_email
				+ ", pan_no=" + pan_no + ", adhar_no=" + adhar_no + ", mobile_no=" + mobile_no + "]";
	}

}
