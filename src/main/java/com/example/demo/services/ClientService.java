package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.Clients;

public interface ClientService {
	
	List<Clients> getAll();
	
	Clients Create(Clients client);
	
	Clients Update(Clients client);
	
	void Delete(Long id);

}
