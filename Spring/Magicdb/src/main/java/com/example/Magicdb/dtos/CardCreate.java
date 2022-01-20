package com.example.Magicdb.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CardCreate {
	
	@NotBlank
	String CardName;
	
	@NotNull
	Float ManaCost;
	
	@NotBlank
	String CardType;
	
	@NotNull
	Float PowerNToughness;
	
	@NotBlank
	String RulesNFlavourText;
	
	@NotBlank
	String SetSymbolsNRarity;
	
	
	public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

	public Float getManaCost() {
		return ManaCost;
	}

	public void setManaCost(Float manaCost) {
		ManaCost = manaCost;
	}

	public String getCardType() {
		return CardType;
	}

	public void setCardType(String cardType) {
		CardType = cardType;
	}

	public Float getPowerNToughness() {
		return PowerNToughness;
	}

	public void setPowerNToughness(Float powerNToughness) {
		PowerNToughness = powerNToughness;
	}

	public String getRulesNFlavourText() {
		return RulesNFlavourText;
	}

	public void setRulesNFlavourText(String rulesNFlavourText) {
		RulesNFlavourText = rulesNFlavourText;
	}

	public String getSetSymbolsNRarity() {
		return SetSymbolsNRarity;
	}

	public void setSetSymbolsNRarity(String setSymbolsNRarity) {
		SetSymbolsNRarity = setSymbolsNRarity;
	}


}
