package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="cust_table")
public class Customer {

	@Id
	@Column(name="customerID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	
	@Column(name="cust_name")
	private String cName;
	
	private String city;
	private String mobile;
	
	private  int age;
	
	public Customer() {
		super();
	}

	public Customer(int custId, String cName, String city, String mobile, int age) {
		super();
		this.custId = custId;
		this.cName = cName;
		this.city = city;
		this.mobile = mobile;
		this.age = age;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\n [custId=" + custId + ", cName=" + cName + ", city=" + city + ", mobile=" + mobile + ", age="
				+ age + "]";
	}
	
	
	
}
