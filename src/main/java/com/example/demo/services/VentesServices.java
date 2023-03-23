package com.example.demo.services;

import com.example.demo.modeles.Ventes;
import java.util.List;



public interface VentesServices {
	
	List<Ventes> getAll();
	
	Ventes Sous(Ventes quantite );
	
	Ventes Create(Ventes boncommande);
	
	Ventes Update(Ventes boncommande);
	
	void Delete(Long id);
}
