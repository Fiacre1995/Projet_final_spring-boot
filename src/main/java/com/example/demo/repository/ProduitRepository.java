package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.modeles.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
}
