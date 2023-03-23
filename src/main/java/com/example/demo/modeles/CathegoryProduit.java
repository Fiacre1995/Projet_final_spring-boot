package com.example.demo.modeles;

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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cathegory_produits")
@AllArgsConstructor
@NoArgsConstructor
public class CathegoryProduit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cath_prod;
	
	@Column(name="Libelle_Cathegory_produit", length = 50)
	private String lib_cath_prod;
	
	/*
	@JsonIdentityReference(alwaysAsId = false)
	@OneToMany(mappedBy = "cathegoryproduit", fetch = FetchType.LAZY)
	private List<Produit> produit;
	*/
	
	@OneToMany(targetEntity=Produit.class,mappedBy="cathegoryproduit",cascade={CascadeType.ALL},orphanRemoval=true)
    Set<Produit> produit = new HashSet<Produit>();

	@Column(updatable = false)
	private String created_at;
	
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

	public Long getId_cath_prod() {
		return id_cath_prod;
	}

	public void setId_cath_prod(Long id_cath_prod) {
		this.id_cath_prod = id_cath_prod;
	}

	public String getLib_cath_prod() {
		return lib_cath_prod;
	}

	public void setLib_cath_prod(String lib_cath_prod) {
		this.lib_cath_prod = lib_cath_prod;
	}
	
	

}
