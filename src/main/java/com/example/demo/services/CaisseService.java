package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.Boutique;
import com.example.demo.modeles.Caisse;

public interface CaisseService {

	List<Caisse> getAll();
	
	Caisse Create(Caisse caisse);
	
	Caisse Update(Caisse caisse);
	
	void Delete(Long id);
	
}
