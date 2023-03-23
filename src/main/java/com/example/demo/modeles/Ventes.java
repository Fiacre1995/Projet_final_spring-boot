package com.example.demo.modeles;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ventes")
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_vente")
public class Ventes  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_vente;
	
	@Column(name="Quantite_de_vente")
	private int qt_vente;
	
	
	public int getMont_vente() {
		return mont_vente;
	}
	public void setMont_vente(int mont_vente) {
		this.mont_vente = mont_vente;
	}
	@Column(name="Montant_vente")
	private int mont_vente;
	
	
	@ManyToOne(targetEntity=Produit.class)
	@JoinColumn(name="id_prod")
	Produit produit;
	
	@Column(updatable = false)
	private String created_at;
	private String updated_at;
	
	

	
	
	
	public int getQt_vente() {
		return qt_vente;
	}
	public void setQt_vente(int qt_vente) {
		this.qt_vente = qt_vente;
	}

	public Long getId_vente() {
		return id_vente;
	}
	public void setId_vente(Long id_vente) {
		this.id_vente = id_vente;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
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
	
	/*
	@Override
	public String toString() {
		return "Ventes [id_vente=" + id_vente + ", qt_vente=" + qt_vente + ", mont_vente="
				+ mont_vente + ", produit=" + produit + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ "]";
	}
*/

	
	
	
	
	

}
