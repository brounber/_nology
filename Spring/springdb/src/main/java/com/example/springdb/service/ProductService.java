package com.example.springdb.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdb.ProductRepository;
import com.example.springdb.dtos.ProductCreateDTO;
import com.example.springdb.entities.Product;

@Service
@Transactional

public class ProductService {
	@Autowired
	ProductRepository repository;
	
	public ArrayLIst<Product> all() {
		return this.repository.findAll();
	}
	
	public Optional<Product> find(long id) {
		return  new ArrayList<>
	}
	
	public Product create(ProductCreateDTO data) {
		
		Product product = new Product();
		product.setName(data.getName());
		product.setPrice(data.getPrice());
		product.setTax(data.getPrice()*0.15f);
		
		this.repository.save(product);
		//Database checks 
		//ProductCreateDTO -> product
		//saving the product entity through the reposity
	}
	
	
	
	public Optional<Product> delete(Long id) {
		return this.repository.deleteById(id);
	}
 	
	
	

}
