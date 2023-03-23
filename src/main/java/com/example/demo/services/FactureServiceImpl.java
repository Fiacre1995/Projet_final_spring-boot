package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.Facture;
import com.example.demo.repository.FactureRepository;

@Service
public class FactureServiceImpl implements FactureService {
	
	@Autowired
	FactureRepository facturerepository;
	
	@Override
	public List<Facture> getAll() {
		// TODO Auto-generated method stub
		return facturerepository.findAll();
	}

	@Override
	public Facture Create(Facture facture) {
		// TODO Auto-generated method stub
		return facturerepository.save(facture);
	}

	@Override
	public Facture Update(Facture facture) {
		// TODO Auto-generated method stub
		return facturerepository.save(facture);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		facturerepository.deleteById(id);
		
	}
	
	
}
