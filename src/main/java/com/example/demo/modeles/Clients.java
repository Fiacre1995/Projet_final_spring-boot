package com.example.demo.modeles;

import java.sql.Date;
import java.util.List;

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

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="client")
@AllArgsConstructor
@NoArgsConstructor
public class Clients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cli;
	
	@Column(name="nom_client", length = 20)
	private String nom_cli;
	
	@Column(name="prenom_produit", length = 50)
	private String prenom_cli;
	
	@Column(name="sexe_client")
	private char sexe_cli;
	
	@Column(updatable = false)
	private String created_at;
	private String updated_at;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cath_cli")
	private CathegoryClient id_cath_cli_cli;
	
	


	public Long getId_cli() {
		return id_cli;
	}


	public void setId_cli(Long id_cli) {
		this.id_cli = id_cli;
	}


	public String getNom_cli() {
		return nom_cli;
	}


	public void setNom_cli(String nom_cli) {
		this.nom_cli = nom_cli;
	}


	public String getPrenom_cli() {
		return prenom_cli;
	}


	public void setPrenom_cli(String prenom_cli) {
		this.prenom_cli = prenom_cli;
	}


	public char getSexe_cli() {
		return sexe_cli;
	}


	public void setSexe_cli(char sexe_cli) {
		this.sexe_cli = sexe_cli;
	}


	

	public CathegoryClient getId_cath_cli_cli() {
		return id_cath_cli_cli;
	}


	public void setId_cath_cli_cli(CathegoryClient id_cath_cli_cli) {
		this.id_cath_cli_cli = id_cath_cli_cli;
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
