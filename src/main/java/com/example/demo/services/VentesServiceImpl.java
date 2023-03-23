package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.Ventes;
import com.example.demo.repository.VentesRepository;

@Service
public class VentesServiceImpl implements VentesServices {
	
	@Autowired
	VentesRepository ventesrepository;

	@Override
	public List<Ventes> getAll() {
		// TODO Auto-generated method stub
		return ventesrepository.findAll();
	}

	@Override
	public Ventes Create(Ventes ventes) {
		// TODO Auto-generated method stub
		return ventesrepository.save(ventes);
	}

	@Override
	public Ventes Update(Ventes ventes) {
		// TODO Auto-generated method stub
		return ventesrepository.save(ventes);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		ventesrepository.deleteById(id);
	}

	@Override
	public Ventes Sous(Ventes quantite) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	@Override
	public List<Ventes> Soust() {
		// TODO Auto-generated method stub
		return ventesrepository.Soustraction();	}

	*/
}
