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

import com.example.demo.modeles.Clients;
import com.example.demo.services.ClientService;




@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientController {
	
	@Autowired
	ClientService clientservice;
	
	@GetMapping
	public List<Clients> getAll() {
		// TODO Auto-generated method stub
		return clientservice.getAll();
	}
	
	@PostMapping
	public Clients Create(@RequestBody Clients client) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		client.setCreated_at(dtf.format(LocalDateTime.now()));
		client.setUpdated_at(dtf.format(LocalDateTime.now()));
		return clientservice.Create(client);
	}
	
	@PutMapping
	public Clients Update(@RequestBody Clients client) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		client.setCreated_at(client.getCreated_at()	);
		client.setUpdated_at(dtf.format(LocalDateTime.now()));
		return clientservice.Update(client);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		clientservice.Delete(id);
	}
		
	
	
}
