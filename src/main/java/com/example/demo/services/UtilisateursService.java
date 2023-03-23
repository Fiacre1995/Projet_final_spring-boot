package com.example.demo.services;

import java.util.List;

import com.example.demo.modeles.Login;
import com.example.demo.modeles.Utilisateurs;

public interface UtilisateursService {
	
	List<Utilisateurs> getAll();
	
	Utilisateurs Create(Utilisateurs utilisateur);
	
	Utilisateurs Update(Utilisateurs utilisateur);
		
	void Delete(Long id);
	
	/*
	 Utilisateurs findAllByEmailAndPassword(Login login);
	 */

}
