package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.Reductions;

public interface ReductionService {

	List<Reductions> getAll();
	
	Reductions Create(Reductions utilisateur);
	
	Reductions Update(Reductions utilisateur);
		
	void Delete(Long id);
}
