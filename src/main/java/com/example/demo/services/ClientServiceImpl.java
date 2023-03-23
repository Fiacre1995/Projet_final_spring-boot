package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.Clients;
import com.example.demo.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientRepository clientrepository;

	@Override
	public List<Clients> getAll() {
		// TODO Auto-generated method stub
		return clientrepository.findAll();
	}

	@Override
	public Clients Create(Clients client) {
		// TODO Auto-generated method stub
		return clientrepository.save(client);
	}

	@Override
	public Clients Update(Clients client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}
