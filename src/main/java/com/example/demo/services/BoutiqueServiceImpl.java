package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.Boutique;
import com.example.demo.repository.BoutiqueRepository;

@Service
public class BoutiqueServiceImpl implements BoutiqueService {
	
	@Autowired
	BoutiqueRepository  boutiquerepository;
	
	@Override
	public List<Boutique> getAll() {
		// TODO Auto-generated method stub
		return boutiquerepository.findAll();
	}

	@Override
	public Boutique Create(Boutique boutique) {
		// TODO Auto-generated method stub
		return boutiquerepository.save(boutique);
	}

	@Override
	public Boutique Update(Boutique boutique) {
		// TODO Auto-generated method stub
		return boutiquerepository.save(boutique);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		boutiquerepository.deleteById(id);
	}
	
	

}
