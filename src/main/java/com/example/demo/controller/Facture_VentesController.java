/*
package com.example.demo.controller;


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

import com.example.demo.modeles.Facture_Ventes;
import com.example.demo.services.Facture_VentesService;

@RestController
@RequestMapping("/facture_ventes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Facture_VentesController {
	
	@Autowired
	Facture_VentesService facture_ventesservice;
	
	@GetMapping
	public List<Facture_Ventes> getAll() {
		// TODO Auto-generated method stub
		return facture_ventesservice.getAll();
	}
	
	@PostMapping
	public Facture_Ventes Create(@RequestBody Facture_Ventes facture_ventes) {
		// TODO Auto-generated method stub
		
		return facture_ventesservice.Create(facture_ventes);
	}
	
	@PutMapping
	public Facture_Ventes Update(@RequestBody Facture_Ventes facture_ventes) {
		// TODO Auto-generated method stub
		
		return facture_ventesservice.Update(facture_ventes);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		facture_ventesservice.Delete(id);
		
	}

}

*/