package com.example.demo.modeles;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Fournisseur")
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseurs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_four;
	
	@Column(name="libelle_fournisseur", length = 50)
	private String lib_four;
	
	@OneToMany(targetEntity=Produit.class,mappedBy="fournisseurs",cascade={CascadeType.ALL},orphanRemoval=true)
    Set<Produit> produit = new HashSet<Produit>();
	
	/*
	@JsonIdentityReference(alwaysAsId = false)
	@OneToMany(mappedBy = "fournisseurs", fetch = FetchType.LAZY)
	private List<Produit> produit;
	*/
	
	private String created_at;
	public Set<Produit> getProduit() {
		return produit;
	}
	public void setProduit(Set<Produit> produit) {
		this.produit = produit;
	}
	private String updated_at;
	
	
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
	public Long getId_four() {
		return id_four;
	}
	public void setId_four(Long id_four) {
		this.id_four = id_four;
	}
	public String getLib_four() {
		return lib_four;
	}
	public void setLib_four(String lib_four) {
		this.lib_four = lib_four;
	}
	
	
}
