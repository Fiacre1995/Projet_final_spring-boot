/*
package com.example.demo.modeles;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class Facture_Ventes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_fact_vente;
	
	@ManyToMany(targetEntity=Facture.class)
	@JoinColumn(name="id_fact")
	Facture facture;
	
	@ManyToMany(targetEntity=Facture.class)
	@JoinColumn(name="id_vente")
	Ventes vente;
	
	@Column(name="Quantite_facture")
	private int qt_facture;

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Ventes getVente() {
		return vente;
	}

	public void setVente(Ventes vente) {
		this.vente = vente;
	}

	public int getQt_facture() {
		return qt_facture;
	}

	public void setQt_facture(int qt_facture) {
		this.qt_facture = qt_facture;
	}
	
	

}

*/