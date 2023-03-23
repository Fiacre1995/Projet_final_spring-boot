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

import com.example.demo.modeles.CathegoryProduit;
import com.example.demo.services.CathegoryProduitService;

@RestController
@RequestMapping("/cathegory_produits")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CathegoryProduitController {

	@Autowired
	CathegoryProduitService  cathegoryproduitservice;
	
	@GetMapping
	public List<CathegoryProduit> getAll() {
		// TODO Auto-generated method stub
		return cathegoryproduitservice.getAll();
	}
	
	@PostMapping
	public CathegoryProduit Create(@RequestBody CathegoryProduit cathegoryproduit) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		cathegoryproduit.setCreated_at(dtf.format(LocalDateTime.now()));
		cathegoryproduit.setUpdated_at(dtf.format(LocalDateTime.now()));
		return cathegoryproduitservice.Create(cathegoryproduit);
	}
	
	@PutMapping
	public CathegoryProduit Update(@RequestBody CathegoryProduit cathegoryproduit) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		cathegoryproduit.setCreated_at(cathegoryproduit.getCreated_at());
		cathegoryproduit.setUpdated_at(dtf.format(LocalDateTime.now()));
		return cathegoryproduitservice.Create(cathegoryproduit);
	}
	
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		
		// TODO Auto-generated method stub
		cathegoryproduitservice.Delete(id);
	}
	
	
	
}
