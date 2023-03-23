package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.modeles.Caisse;
import com.example.demo.repository.CaisseRepository;

@Service
public class CaisseServiceImpl implements CaisseService {
	
	@Autowired
	CaisseRepository caisserepository;
	
	@Override
	public List<Caisse> getAll() {
		// TODO Auto-generated method stub
		return caisserepository.findAll();
	}

	@Override
	public Caisse Create(Caisse caisse) {
		// TODO Auto-generated method stub
		return caisserepository.save(caisse);
	}

	@Override
	public Caisse Update(Caisse caisse) {
		// TODO Auto-generated method stub
		return caisserepository.save(caisse);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		caisserepository.deleteById(id);
	}

	
	
}
