package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.modeles.Fournisseurs;
import com.example.demo.repository.FournisseursRepository;

@Service
public class FournisseursServiceImpl implements FournisseursService{

	@Autowired 
	FournisseursRepository fournisseursrepository;

	@Override
	public List<Fournisseurs> getAll() {
		// TODO Auto-generated method stub
		return fournisseursrepository.findAll();
	}

	@Override
	public Fournisseurs Create(Fournisseurs fournisseurs) {
		// TODO Auto-generated method stub
		return fournisseursrepository.save(fournisseurs);
	}

	@Override
	public Fournisseurs Update(Fournisseurs fournisseurs) {
		// TODO Auto-generated method stub
		return fournisseursrepository.save(fournisseurs);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		fournisseursrepository.deleteById(id);
	}
	
	
}
