package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.CathegoryProduit;
import com.example.demo.repository.CathegoryProduitRepository;

@Service
public class CathegoryProduitServiceImpl implements CathegoryProduitService {
	
	@Autowired
	CathegoryProduitRepository cathegoryproduitrepository;
	
	@Override
	public List<CathegoryProduit> getAll() {
		// TODO Auto-generated method stub
		return cathegoryproduitrepository.findAll();
	}

	@Override
	public CathegoryProduit Create(CathegoryProduit cathegoryproduit) {
		// TODO Auto-generated method stub
		return cathegoryproduitrepository.save(cathegoryproduit);
	}

	@Override
	public CathegoryProduit Update(CathegoryProduit cathegoryproduit) {
		// TODO Auto-generated method stub
		return cathegoryproduitrepository.save(cathegoryproduit);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		cathegoryproduitrepository.deleteById(id);
	}

	
}
