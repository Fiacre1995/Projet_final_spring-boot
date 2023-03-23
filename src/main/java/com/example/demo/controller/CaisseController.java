package com.example.demo.controller;

import java.util.List;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

import com.example.demo.modeles.Caisse;
import com.example.demo.services.CaisseService;

@RestController
@RequestMapping("/caisse")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CaisseController {

	@Autowired
	CaisseService CaisseService;
	
	@GetMapping
	public List<Caisse> getAll() {
		// TODO Auto-generated method stub
		return CaisseService.getAll();
	}
	
	@PostMapping
	public Caisse Create(@RequestBody Caisse caisse) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		caisse.setCreated_at(dtf.format(LocalDateTime.now()));
		caisse.setUpdated_at(dtf.format(LocalDateTime.now()));
		return CaisseService.Create(caisse);
	}
	
	@PutMapping
	public Caisse Update(@RequestBody Caisse caisse) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		caisse.setUpdated_at(dtf.format(LocalDateTime.now()));
		caisse.setCreated_at(caisse.getCreated_at());
		return CaisseService.Update(caisse);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		CaisseService.Delete(id);
	}
	
	
}
