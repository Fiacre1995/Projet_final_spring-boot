package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.CathegoryClient;
import com.example.demo.repository.CathegoryClientRepository;

@Service
public class CathegoryClientServiceImpl implements CathegoryClientService {

	@Autowired
	CathegoryClientRepository cathegoryclientrepository;
	
	@Override
	public List<CathegoryClient> getAll() {
		// TODO Auto-generated method stub
		return cathegoryclientrepository.findAll();
	}

	@Override
	public CathegoryClient Create(CathegoryClient cathegoryclient) {
		// TODO Auto-generated method stub
		return cathegoryclientrepository.save(cathegoryclient);
	}

	@Override
	public CathegoryClient Update(CathegoryClient cathegoryclient) {
		// TODO Auto-generated method stub
		return cathegoryclientrepository.save(cathegoryclient);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		cathegoryclientrepository.deleteById(id);
	}

	
}
