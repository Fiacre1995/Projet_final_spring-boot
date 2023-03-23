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

import com.example.demo.modeles.Fournisseurs;
import com.example.demo.services.FournisseursService;

@RestController
@RequestMapping("/fournisseur")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FournisseursController {
	
	@Autowired
	FournisseursService fournisseursservice;

	@GetMapping
	public List<Fournisseurs> getAll() {
		// TODO Auto-generated method stub
		return fournisseursservice.getAll();
	}
	
	@PostMapping
	public Fournisseurs Create(@RequestBody Fournisseurs fournisseurs) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		fournisseurs.setCreated_at(dtf.format(LocalDateTime.now()));
		fournisseurs.setUpdated_at(dtf.format(LocalDateTime.now()));
		return fournisseursservice.Create(fournisseurs);
	}
	
	@PutMapping
	public Fournisseurs Update(@RequestBody Fournisseurs fournisseurs) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		fournisseurs.setCreated_at(fournisseurs.getCreated_at());
		fournisseurs.setUpdated_at(dtf.format(LocalDateTime.now()));
		return fournisseursservice.Update(fournisseurs);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		fournisseursservice.Delete(id);
	}
}
