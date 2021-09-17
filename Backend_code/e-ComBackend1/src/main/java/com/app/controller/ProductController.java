package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Product;
import com.app.service.IProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
	
//		get instance of Service method 
	@Autowired
	IProductService service ;
	
	public ProductController() {
			System.out.println("In a product controller ");
		}
		
	@GetMapping
	public List<Product> getAllProduct(){
		System.out.println("In product controller get all product ");
		return service.fetchAllProducts();
	}
		
}
