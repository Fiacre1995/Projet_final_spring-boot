package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.Produit;

public interface ProduitService {
	
	List<Produit> getAll();
	
	Produit Create(Produit produit);
	
	Produit Update(Produit produit);
	
	void Delete(Long id);


}
