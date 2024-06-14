package edu.jsp.SpringBootMapping2.Dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Coach {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String name;
 private int age;
 private String domain;
 private long contact;
 
 @OneToMany(cascade = CascadeType.ALL)
 private List<Players>p;

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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getDomain() {
	return domain;
}

public void setDomain(String domain) {
	this.domain = domain;
}

public long getContact() {
	return contact;
}

public void setContact(long contact) {
	this.contact = contact;
}

public List<Players> getP() {
	return p;
}

public void setP(List<Players> p) {
	this.p = p;
}
 
}
