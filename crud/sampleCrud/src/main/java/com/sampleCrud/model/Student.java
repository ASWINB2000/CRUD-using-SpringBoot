package com.sampleCrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sample_one")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String cource;
	private int fee;
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
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Student(int id, String name, String cource, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.cource = cource;
		this.fee = fee;
	}
	public Student() {
	
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cource=" + cource + ", fee=" + fee + "]";
	}
	

}
