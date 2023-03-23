package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.Facture;

public interface FactureService {

	List<Facture> getAll();
	
	Facture Create(Facture facture);
	
	Facture Update(Facture facture);
	
	void Delete(Long id);
}
