package com.example.demo.modeles;



import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="produit")
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id_prod")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_prod;
	
	@Column(name="libelle_produit", length = 50)
	private String lib_prod;

	@Column(name="prix_produit", length = 20)
	private int prix_prod;
	
	@Column(name="Quantite_produit", length = 20) 
	private int qt_prod;
	
	public int getQt_prod() {
		return qt_prod;
	}

	public void setQt_prod(int qt_prod) {
		this.qt_prod = qt_prod;
	}

	@Column(updatable = false)
	private String createdAt;
	
	private String updatedAt;
	
	/*
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cath_prod")
	private CathegoryProduit cathegoryproduit;
	*/
	
	 @ManyToOne(targetEntity=CathegoryProduit.class)
	 @JoinColumn(name="id_cath_prod")
	 CathegoryProduit cathegoryproduit;
	 
//	 public Set<Ventes> getVentes() {
//		return ventes;
//	}
//
//	public void setVentes(Set<Ventes> ventes) {
//		this.ventes = ventes;
//	}

	@ManyToOne(targetEntity=Fournisseurs.class)
	 @JoinColumn(name="id_four")
	 Fournisseurs fournisseurs;
	 
	 /*@OneToMany(targetEntity=Ventes.class,mappedBy="produit",cascade={CascadeType.ALL},orphanRemoval=true)
	 Set<Ventes> ventes = new HashSet<Ventes>();*/ 
	
	/*
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_four")
	private Fournisseurs fournisseurs;
	*/
	
	/*
	@JsonIdentityReference(alwaysAsId = false)
	@OneToMany(mappedBy = "produit", fetch = FetchType.LAZY)
	private List<Ventes> ventes;
	*/
	
	
	
	
	
	public Fournisseurs getFournisseurs() {
		return fournisseurs;
	}

	public void setFournisseurs(Fournisseurs fournisseurs) {
		this.fournisseurs = fournisseurs;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_bout")
	private Boutique id_bout_fk;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_fact")
	private Facture id_fact_fk;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_bon")
	private Ventes id_bon_fk;

	public Long getId_prod() {
		return id_prod;
	}

	public void setId_prod(Long id_prod) {
		this.id_prod = id_prod;
	}

	public String getLib_prod() {
		return lib_prod;
	}

	public void setLib_prod(String lib_prod) {
		this.lib_prod = lib_prod;
	}

	public int getPrix_prod() {
		return prix_prod;
	}

	public void setPrix_prod(int prix_prod) {
		this.prix_prod = prix_prod;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	

	public CathegoryProduit getCathegoryproduit() {
		return cathegoryproduit;
	}

	public void setCathegoryproduit(CathegoryProduit cathegoryproduit) {
		this.cathegoryproduit = cathegoryproduit;
	}

	public Boutique getId_bout_fk() {
		return id_bout_fk;
	}

	public void setId_bout_fk(Boutique id_bout_fk) {
		this.id_bout_fk = id_bout_fk;
	}

	public Facture getId_fact_fk() {
		return id_fact_fk;
	}

	public void setId_fact_fk(Facture id_fact_fk) {
		this.id_fact_fk = id_fact_fk;
	}

	public Ventes getId_bon_fk() {
		return id_bon_fk;
	}

	public void setId_bon_fk(Ventes id_bon_fk) {
		this.id_bon_fk = id_bon_fk;
	}



	

	

}
