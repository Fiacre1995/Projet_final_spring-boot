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

import com.example.demo.modeles.CathegoryClient;
import com.example.demo.services.CathegoryClientService;

@RestController
@RequestMapping("/client_controller")
public class CathegoryClientController {

	@Autowired
	CathegoryClientService cathegoryclientservice;
	
	@GetMapping
	public List<CathegoryClient> getAll() {
		// TODO Auto-generated method stub
		return cathegoryclientservice.getAll();
	}
	
	@PostMapping
	public CathegoryClient Create(@RequestBody CathegoryClient cathegoryclient) {
		// TODO Auto-generated method stub
		return cathegoryclientservice.Create(cathegoryclient);
	}
	
	@PutMapping
	public CathegoryClient Update(@RequestBody CathegoryClient cathegoryclient) {
		// TODO Auto-generated method stub
		
		return cathegoryclientservice.Update(cathegoryclient);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		cathegoryclientservice.Delete(id);
	}
	
	
}
