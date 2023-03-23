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

import com.example.demo.modeles.Produit;
import com.example.demo.services.ProduitService;

@RestController
@RequestMapping("/produits")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProduitController {
	
	@Autowired
	ProduitService produitservice;
	
	@GetMapping
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return produitservice.getAll();
	}
	
	@PostMapping
	public Produit Create(@RequestBody Produit produit) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		produit.setCreatedAt(dtf.format(LocalDateTime.now()));
		produit.setUpdatedAt(dtf.format(LocalDateTime.now()));
		return produitservice.Create(produit);
	}
	
	@PutMapping
	public Produit Update(@RequestBody Produit produit) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		produit.setCreatedAt(produit.getCreatedAt());
		produit.setUpdatedAt(dtf.format(LocalDateTime.now()));
		return produitservice.Update(produit);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		
		// TODO Auto-generated method stub
		produitservice.Delete(id);
	}

}
