package com.springboot.microservice.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    
	@Id
	private int id;
	
	private String name;
	
	private int percentage;
	
	private int contact;
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
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", contact=" + contact + "]";
	}
	public Student(int id, String name, int percentage, int contact) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.contact = contact;
	}
	
	
}
