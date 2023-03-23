package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.modeles.Produit;
import com.example.demo.modeles.Ventes;

public interface VentesRepository extends JpaRepository<Ventes, Long> {
	
	/*
	public List<Ventes> findAllByFacture(long factureId);
	@Query("SELECT p.qt_prod, v.qt_vente FROM Ventes v inner join produit p on p.id_prod = v.id_prod")
	public List<Ventes> Soustraction(); 
	*/
	
	/* SELECT p.qt_prod, v.qt_vente FROM Ventes v inner join v.produit p */

}
