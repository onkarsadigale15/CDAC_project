package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tblCust")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Customer extends BaseEntity {
	@Column(length = 20 , nullable = false)
	private String name ;
	
	@Column(length = 20 , nullable = false , unique = true)
	private String email ;
	
	@Column(length = 12)
	private String mobileNum;
	
	@Column(nullable = false)
	private boolean isActive  ;

	@Column(length = 20 , nullable = false)
	private String address ;
	
//	one to one 
//	cust ---> cart 
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cart_id")
	private Cart cart ;
}
