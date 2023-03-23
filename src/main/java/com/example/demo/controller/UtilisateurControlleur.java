package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modeles.Login;
import com.example.demo.modeles.Utilisateurs;
import com.example.demo.services.UtilisateursService;

@RestController
@RequestMapping("/utilisateur")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UtilisateurControlleur {
	
	@Autowired
	UtilisateursService utilisateursservice;
	
	@GetMapping
	public List<Utilisateurs> getAll() {
		// TODO Auto-generated method stub
		return utilisateursservice.getAll();
	}
	
	@PostMapping
	public Utilisateurs Create(@RequestBody Utilisateurs utilisateur) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		utilisateur.setCreated_at(dtf.format(LocalDateTime.now()));
		utilisateur.setUpdated_at(dtf.format(LocalDateTime.now()));
		return utilisateursservice.Create(utilisateur);
	}
	
	@PutMapping
	public Utilisateurs Update(@RequestBody Utilisateurs utilisateur) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		utilisateur.setCreated_at(utilisateur.getCreated_at());
		utilisateur.setUpdated_at(dtf.format(LocalDateTime.now()));
		return utilisateursservice.Update(utilisateur);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		utilisateursservice.Delete(id);
	}
	
	/*
	@PostMapping("/login")
	public Utilisateurs Create(@RequestBody Login login) {
		// TODO Auto-generated method stub
		return utilisateursservice.findAllByEmailAndPassword(login);
	}
	*/
	

}
