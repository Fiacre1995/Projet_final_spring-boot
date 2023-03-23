package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modeles.Login;
import com.example.demo.modeles.Utilisateurs;
import com.example.demo.repository.UtilisateurRepository;

@Service
public class UtilisateursServiceImpl implements UtilisateursService {
	
	@Autowired
	UtilisateurRepository utilisateurrepository;
	
	@Override
	public List<Utilisateurs> getAll() {
		// TODO Auto-generated method stub
		return utilisateurrepository.findAll();
	}

	@Override
	public Utilisateurs Create(Utilisateurs utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurrepository.save(utilisateur);
	}

	@Override
	public Utilisateurs Update(Utilisateurs utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurrepository.save(utilisateur);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		utilisateurrepository.deleteById(id);
	}
	
	/*

	@Override
	public Utilisateurs findAllByEmailAndPassword(Login login) {
		Optional<Utilisateurs> utilisateur = utilisateurrepository.findByemail_userAndpassword_user(login.getEmail_user(),login.getPassword_user());
		return utilisateur.get();
	}
	
	*/


	
}
