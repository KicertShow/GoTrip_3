package com.ispan.group3.repository;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "comment")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "item_tb", nullable = false)
	@Column(name = "item_tb")
	private String itemTb;
	@Column(name = "item_id")
	private Integer itemId;
	@Column(name = "user_id")
	private String userId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Timestamp date;
	private Integer rating;
	private String content;
	private String image1;
	private String image2;
	private String image3;
//	@Transient
	
	
	public Comment() {
		
	}
	
	public Comment(Integer id, String itemTb, Integer itemId, String userId, Timestamp date, Integer rating,
			String content, String image1, String image2, String image3) {
		this.id = id;
		this.itemTb = itemTb;
		this.itemId = itemId;
		this.userId = userId;
		this.date = date;
		this.rating = rating;
		this.content = content;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}



	public Comment(String itemTb, Integer itemId, String userId, Timestamp date, Integer rating, String content,
			String image1, String image2, String image3) {
		this.itemTb = itemTb;
		this.itemId = itemId;
		this.userId = userId;
		this.date = date;
		this.rating = rating;
		this.content = content;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemTb() {
		return itemTb;
	}

	public void setItemTb(String itemTb) {
		this.itemTb = itemTb;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + 
				", itemTb=" + itemTb + 
				", itemId=" + itemId + 
				", userId=" + userId + 
				", date=" + date + 
				", rating=" + rating + 
				", content=" + content + 
				", image1=" + image1 + 
				", image2=" + image2 + 
				", image3=" + image3 + "]";
	}

	
	
}
