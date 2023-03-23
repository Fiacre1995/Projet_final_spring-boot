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

import com.example.demo.modeles.Boutique;
import com.example.demo.services.BoutiqueService;

@RestController
@RequestMapping("/boutique")
public class BoutiqueController {

	@Autowired
	BoutiqueService boutiqueservice;
	
	@GetMapping
	public List<Boutique> getAll() {
		// TODO Auto-generated method stub
		return boutiqueservice.getAll();
	}
	
	@PostMapping
	public Boutique Create(@RequestBody Boutique boutique) {
		// TODO Auto-generated method stub
		return boutiqueservice.Create(boutique);
	}
	
	@PutMapping
	public Boutique Update(@RequestBody Boutique boutique) {
		// TODO Auto-generated method stub
		return boutiqueservice.Update(boutique);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		boutiqueservice.Delete(id);
	}
}
