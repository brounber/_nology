package com.example.Magicdb.controller;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Magicdb.entities.Card;
import com.example.Magicdb.service.CardService;

@RestController
@RequestMapping(value = "/cards");

public class CardController {
	@Autowired
	CardService Service;
	
	// GET /card
	@GetMapping
	public ResponseEntity<ArrayList<Card>> all() {
		ArrayList<Card> cards = this.service.all();
		return new ResponseEntity<>(cards, HttpStatus.OK);
	}
	
	// GET /products/{id}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Card> find(@PathVariable Long id) {
		Optional<Card> cards = this.service.find(id);
		
		if (cards.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(cards.get(), HttpStatus.OK);
	}
	

}
