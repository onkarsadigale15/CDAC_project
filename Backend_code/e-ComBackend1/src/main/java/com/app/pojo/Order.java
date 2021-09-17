package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "tblOrder")
public class Order extends BaseEntity {
	
	@Enumerated(EnumType.STRING)
	@Column
	private PaymentStatus paymentStatus ;
	
	@Column
	private int quantity ;
	
	@Column
	private int price ;
	
	@Column
	private LocalDate orderDate = LocalDate.now();
	
//	one to one 
//	order -- customer
	
//	one to one 
//	order -- cart 
	
//	one to many 
//	order -- products
}
