package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.Produit;
import com.example.demo.repository.ProduitRepository;

@Service

public class ProduitServiceImpl implements ProduitService{
	
	@Autowired
	ProduitRepository produitrepository;

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return produitrepository.findAll();
	}

	@Override
	public Produit Create(Produit produit) {
		// TODO Auto-generated method stub
		return produitrepository.save(produit);
	}

	@Override
	public Produit Update(Produit produit) {
		// TODO Auto-generated method stub
		return produitrepository.save(produit);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		produitrepository.deleteById(id);
	}

}
