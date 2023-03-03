package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Child {
	@Id
    private int babyid;
    private String babyfirstname;
    private String babylastname;
    private String fathername;
    private String mothername;
    private String address;
    
    
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(int babyid, String babyfirstname, String babylastname, String fathername, String mothername,
			String address) {
		super();
		this.babyid = babyid;
		this.babyfirstname = babyfirstname;
		this.babylastname = babylastname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.address = address;
	}
	public int getBabyid() {
		return babyid;
	}
	public void setBabyid(int babyid) {
		this.babyid = babyid;
	}
	public String getBabyfirstname() {
		return babyfirstname;
	}
	public void setBabyfirstname(String babyfirstname) {
		this.babyfirstname = babyfirstname;
	}
	public String getBabylastname() {
		return babylastname;
	}
	public void setBabylastname(String babylastname) {
		this.babylastname = babylastname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}