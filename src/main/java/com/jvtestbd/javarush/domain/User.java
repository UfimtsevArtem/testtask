package com.jvtestbd.javarush.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 5767552018827984176L;

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "NAME",nullable = false)
	private String name;
	
	@Column(name = "AGE",nullable = false)
	private int age;
	
	@Column(name = "IS_ADMIN",nullable = false)
	private boolean Admin;

	@Column(name = "CREATED_DATE",nullable = false)
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public boolean getAdmin() {
		return Admin;
	}

	public void setAdmin(boolean isAdmin) {
		this.Admin = isAdmin;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = new Date();
	}
}
