package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.CathegoryClient;

public interface CathegoryClientService {
	
	List<CathegoryClient> getAll();
	
	CathegoryClient Create(CathegoryClient cathegoryclient);
	
	CathegoryClient Update(CathegoryClient cathegoryclient);
	
	void Delete(Long id);

}
