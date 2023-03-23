package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.Boutique;

public interface BoutiqueService {

	List<Boutique> getAll();
	
	Boutique Create(Boutique boutique);
	
	Boutique Update(Boutique boutique);
	
	void Delete(Long id);

}
