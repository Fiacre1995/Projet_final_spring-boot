package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import com.example.demo.modeles.Facture;
import com.example.demo.modeles.Produit;
import com.example.demo.modeles.Ventes;
import com.example.demo.services.FactureService;
import com.example.demo.services.VentesServices;

import payload.FacturePayload;

@RestController
@RequestMapping("/facture")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FactureController {
	
	@Autowired
	FactureService factureservice;
	
	@Autowired
	VentesServices ventesservices;
	
	@GetMapping
	public List<Facture> getAll() {
		// TODO Auto-generated method stub
		return factureservice.getAll();
	}
	
	@PostMapping
	public Facture Create(@RequestBody Facture facture) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			facture.setCreated_at(dtf.format(LocalDateTime.now()));
			facture.setUpdated_at(dtf.format(LocalDateTime.now()));
			return factureservice.Create(facture);
		/*
		facturePayload.getVentes().forEach(ventePayload->{
			Ventes vente=new Ventes();
			vente.setId_vente(ventePayload.getId_vente());
			Facture factureNew=new Facture();
			factureNew.setId_fact(factureCreate.getId_fact()); 
			vente.setFacture(factureNew);
			//vente.setProduit(ventePayload.getProduit());
			vente.setQt_vente(ventePayload.getQt_vente());
			  
			System.out.println(vente);
			
			ventesservices.Update(vente);
		});
		
		return factureCreate;
		*/
	}
	
	@PutMapping
	public Facture Update(@RequestBody Facture facture) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		facture.setCreated_at(facture.getCreated_at());
		facture.setUpdated_at(dtf.format(LocalDateTime.now()));
		return factureservice.Update(facture);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@Validated @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		factureservice.Delete(id);
		
	}
	
}
