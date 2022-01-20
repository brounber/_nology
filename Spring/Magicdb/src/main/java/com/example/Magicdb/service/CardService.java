package com.example.Magicdb.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Magicdb.Repos.CardRepository;
import com.example.Magicdb.dtos.CardCreate;
import com.example.Magicdb.entities.Card;

@Service
@Transactional

public class CardService {
	@Autowired
	CardRepository repository;
	
	public ArrayList<Card> all() {
		return new ArrayList<>(this.repository.findAll());
	}
	
	public Optional<Card> find(Long id) {
		return this.repository.findById(id);
	}
	
	public Card create(CardCreate data) {
		Card card = new Card();
		Card.setCardName(data.getCardName());
		Card.setManaCost(data.getManaCost());
		Card.setCardType(data.getCardType());
		Card.setPowerNToughness(data.getPowerNToughness());
		Card.setRulesNFlavourText(data.getRulesNFlavourText());
		Card.setSetSymbolsNRarity(data.getSetSymbolsNRarity());
		
		return this.repository.save(card);
	}
	
	//card update do later

}
