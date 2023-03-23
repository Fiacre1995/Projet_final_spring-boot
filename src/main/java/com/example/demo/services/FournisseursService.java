package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.Fournisseurs;

public interface FournisseursService {
	
	List<Fournisseurs> getAll();
	
	Fournisseurs Create(Fournisseurs fournisseurs);
	
	Fournisseurs Update(Fournisseurs fournisseurs);
	
	void Delete(Long id);
}

