package com.example.Magicdb.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Magicdb.entities.Card;

public interface CardRepository extends JpaRepository<Card, Long>{
	 

}
