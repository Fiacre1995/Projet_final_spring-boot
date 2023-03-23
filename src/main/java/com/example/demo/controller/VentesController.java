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

import com.example.demo.modeles.Ventes;
import com.example.demo.services.VentesServices;

@RestController
@RequestMapping("/ventes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VentesController {
	
	@Autowired
	VentesServices ventesservices;
	
	@GetMapping
	public List<Ventes> getAll() {
		// TODO Auto-generated method stub
		return ventesservices.getAll();
	}
	
	/*
	@GetMapping("/sous")
	public List<Ventes> getsous() {
		// TODO Auto-generated method stub
		return ventesservices.Soust();
	}
	*/
	
	@PostMapping
	public Ventes Create(@RequestBody Ventes ventes) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		ventes.setCreated_at(dtf.format(LocalDateTime.now()));
		ventes.setUpdated_at(dtf.format(LocalDateTime.now()));
		return ventesservices.Create(ventes);
	}
	
	@PutMapping
	public Ventes Update(@RequestBody Ventes ventes) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		ventes.setUpdated_at(dtf.format(LocalDateTime.now()));
		return ventesservices.Update(ventes);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable Long id) {
		// TODO Auto-generated method stub
		ventesservices.Delete(id);
	}

}
