package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modeles.Caisse;

public interface CaisseRepository extends JpaRepository<Caisse, Long> {
	
	

}
