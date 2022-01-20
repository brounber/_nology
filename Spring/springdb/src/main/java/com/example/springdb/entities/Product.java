package com.example.springdb.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;


@Entity

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@NotNull
	Float price;
	
	@NotBlank
	String name;
	
	@NotNull
	Float tax;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

}
