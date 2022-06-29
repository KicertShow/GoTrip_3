//package com.ispan.group3.repository;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Item {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "id", unique = true, nullable = false)
//	private Integer id;
//	private String enName;
//	private String chName;
//	
//	public Item(Integer id, String enName, String chName) {
//		this.id = id;
//		this.enName = enName;
//		this.chName = chName;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getEnName() {
//		return enName;
//	}
//	public void setEnName(String enName) {
//		this.enName = enName;
//	}
//	public String getChName() {
//		return chName;
//	}
//	public void setChName(String chName) {
//		this.chName = chName;
//	}
//	
//	
//	
//}
