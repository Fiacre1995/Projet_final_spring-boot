/*
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.Facture_Ventes;
import com.example.demo.repository.Facture_VentesRepository;

@Service
public class Facture_VentesServiceImpl implements Facture_VentesService {
	
	@Autowired
	Facture_VentesRepository facture_ventesRepository;

	@Override
	public List<Facture_Ventes> getAll() {
		// TODO Auto-generated method stub
		return facture_ventesRepository.findAll();
	}

	@Override
	public Facture_Ventes Create(Facture_Ventes facture_ventes) {
		// TODO Auto-generated method stub
		return facture_ventesRepository.save(facture_ventes);
	}

	@Override
	public Facture_Ventes Update(Facture_Ventes facture_ventes) {
		// TODO Auto-generated method stub
		return facture_ventesRepository.save(facture_ventes);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		facture_ventesRepository.deleteById(id);
	}
	
	
}
*/