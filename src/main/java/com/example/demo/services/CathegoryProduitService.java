package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.CathegoryProduit;

public interface CathegoryProduitService {

	List<CathegoryProduit> getAll();
	
	CathegoryProduit Create(CathegoryProduit cathegoryproduit);
	
	CathegoryProduit Update(CathegoryProduit cathegoryproduit);
	
	void Delete(Long id);
}
