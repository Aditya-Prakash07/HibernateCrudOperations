package com.aditya.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//we can provide mapping with the help of annotations (insted of xml). Annotaitons are widely used

@Entity
@Table   // if you want table name to something different than  class name you can do it like @Table (name = "another_name")
public class User { // User will be the name of the table 
	@Id // to this an id of the sql table
	@Column // to make a column with the same name
	private int id;     // while using hibernate we also need to create an unique id
	
	@Column
	private String name;
	
	@Column
	private String email; // these are the columns we will be having inside the table
	
	@Column
	private String password;
	
	@Column
	private String gender;
	
	@Column
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
