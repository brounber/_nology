package com.example.springdb.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdb.dtos.ProductCreateDTO;
import com.example.springdb.entities.Product;
import com.example.springdb.service.ProductService;

@RestController
@RequestMapping(value="/products")



public class ProductController {
	
	@Autowired
	ProductService service;
	
	//Get /products
	@GetMapping
	public ResponseEntity<ArrayList<Product>> all() {
		ArrayList<Product> products = this.service.all();
	
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Product> create(@Valid @RequestBody ProductCreateDTO data) {
		Product product = this.service.create(data);
		return new ResponseEntity<>(product, HttpStatus.CREATED);
		//return String.format("Product: %s, %.2f", product.getName(), product.getPrice());
	}
	
	@PatchMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	
	
	@DeleteMapping(value = "/{id}");
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		
		
	}

}
