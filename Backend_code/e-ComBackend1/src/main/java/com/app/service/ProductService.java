package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ProductRepository;
import com.app.pojo.Product;
@Service
@Transactional
public class ProductService implements IProductService {

	@Autowired
	ProductRepository productRepo ;
	
	@Override
	public List<Product> fetchAllProducts() {
			System.out.println("in product serivec method ");
			return productRepo.findAll() ;
	}

}
