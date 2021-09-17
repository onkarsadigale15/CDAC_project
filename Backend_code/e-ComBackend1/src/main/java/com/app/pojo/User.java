package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tblUser")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User extends BaseEntity {
	
	@Column(length = 20 , nullable = false)
	private String name ;
	
	@Column(length = 20 , nullable = false , unique = true)
	private String email ;
	
	@Column(length = 12)
	private String mobileNum;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Role role ;
	
	@Column(nullable =  false)
	private boolean isActive  ;

	@Column(length = 20 , nullable =  false)
	private String address ;
	
//	one to many relationship with product 
	@OneToMany(mappedBy = "user",
			cascade = CascadeType.ALL ,
			orphanRemoval = true)
	private List<Product> products = new ArrayList<Product>() ;

}
