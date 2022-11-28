package com.ty.schooldemo.dto;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
	@Id
@jakarta.persistence.GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)
private int id;
private String name;
private long phone;
private String school;
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
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", school=" + school + "]";
}

}
