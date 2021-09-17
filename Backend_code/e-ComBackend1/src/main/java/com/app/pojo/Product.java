package com.app.pojo;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tblProduct")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product extends BaseEntity {

//	category id many to one 
	@ManyToOne(fetch = FetchType.LAZY  )
	@JoinColumn(name = "cat_id")
	private Category category ;
	
//	vendor id 
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "user_id")
	private User user ;
	
//	many to one 
//	product ---> cart 
	
//	@ManyToOne(fetch =  FetchType.LAZY,
//			cascade =  CascadeType.ALL)
//	@JoinColumn(name = "cart_id")
//	private Cart cart ;
	
	@Column(length = 20 ,nullable = false)
	private String name ;
	
	@Column(length = 64 ,nullable = false)
	private String description ;
	
//	image 
	@Lob
	@JsonProperty("image")
	@Column(length = 1000)
	private byte[] image ;
	
	@Column(nullable = false)
	private int price ; 
	
	@Column
	private float discount;
	
	@Column(nullable = false)
	private boolean isActive;
}
