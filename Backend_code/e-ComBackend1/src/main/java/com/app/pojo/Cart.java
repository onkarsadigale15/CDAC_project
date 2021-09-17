package com.app.pojo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="tblCart")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cart extends BaseEntity {
		@Column(nullable = false)
		private int quantity ;
		
		@Enumerated(EnumType.STRING)
		@Column
		private Status status ;
		@Column
		private LocalDate date = LocalDate.now();
		
//		one to one 
//		cart --- customer
		@OneToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "cust_id")
		private Customer customer ;
		
//		one to many 
//		cart ---> product 
		@OneToMany(fetch = FetchType.EAGER,
				cascade = CascadeType.ALL
				)
		@JoinColumn(name = "cart_id")
		private List<Product> products = new ArrayList<Product>() ;

}
