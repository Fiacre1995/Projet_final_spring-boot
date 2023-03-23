package com.example.demo.modeles;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="facture")
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_fact")
public class Facture implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_fact;
	
	@Column(name="Montant_total_facture")
	private int mont_fact;
	
	@ManyToOne(targetEntity=Ventes.class)
	@JoinColumn(name="id_vente")
	Ventes ventes;
	
	
	@ManyToOne(targetEntity=Clients.class)
	@JoinColumn(name="id_cli")
	Clients clients;
	
	
	public Caisse getCaisse() {
		return caisse;
	}
	public void setCaisse(Caisse caisse) {
		this.caisse = caisse;
	}
	@ManyToOne(targetEntity=Caisse.class)
	@JoinColumn(name="id_caiss")
	Caisse caisse;
	
	
	
	/*
	@OneToMany(mappedBy = "facture",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	private List<Ventes> ventes;
	*/
	
	public Ventes getVentes() {
		return ventes;
	}
	public void setVentes(Ventes ventes) {
		this.ventes = ventes;
	}
	@Column(updatable = false)
	private String created_at;
	
	private String updated_at;
	
	
	
	public int getMont_fact() {
		return mont_fact;
	}
	public void setMont_fact(int mont_fact) {
		this.mont_fact = mont_fact;
	}
	public Long getId_fact() {
		return id_fact;
	}
	public void setId_fact(Long id_fact) {
		this.id_fact = id_fact;
	}
	
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	
	
	
	

	
	
	
}
