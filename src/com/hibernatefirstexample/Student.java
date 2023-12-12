package com.hibernatefirstexample;

import javax.persistence.Entity;
import javax.persistence.Id;

//jo banda table se map hota hai waha

@Entity
public class Student{
	
	//primary key
	@Id
	private int id;
	private String ename;
	
	//setter getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	//constructor
	public Student(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", ename=" + ename + "]";
	}
	
	
	
}
