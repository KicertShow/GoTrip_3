package com.ispan.group3.repository;


import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
@Entity
@Table(name = "Hotel")
@Component("Hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String hotel_name;
	private Integer price;
	private String boss_name;
	private String phone;
	private String status;
	private String roomtype;
	private  Blob image;   //之後接受照片的容器
	private  String fileName; //接檔案名稱
	@CreationTimestamp
	private  Timestamp admissionTime; //街道檔案的那時候時間
	@Transient
	private  MultipartFile productImage;

	
	
	}	