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

import com.example.demo.modeles.Reductions;
import com.example.demo.services.ReductionService;

@RestController
@RequestMapping("/reduction")
public class ReductionsController {
	
	@Autowired
	ReductionService reductionservice;
	
	@GetMapping
	public List<Reductions> getAll() {
		// TODO Auto-generated method stub
		return reductionservice.getAll();
	}
	
	@PostMapping
	public Reductions Create(@RequestBody Reductions reduction) {
		// TODO Auto-generated method stub
		return reductionservice.Create(reduction);
	}
	
	@PutMapping
	public Reductions Update(@RequestBody Reductions reduction) {
		// TODO Auto-generated method stub
		return reductionservice.Update(reduction);
	}
	
	@DeleteMapping
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		reductionservice.Delete(id);
		
	}
	
	
	
}
