package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modeles.Fournisseurs;

public interface FournisseursRepository extends JpaRepository<Fournisseurs, Long> {
	
	
}
