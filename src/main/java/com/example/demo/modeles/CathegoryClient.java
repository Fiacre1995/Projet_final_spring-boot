package com.example.demo.modeles;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Cathegory_client")
@AllArgsConstructor
@NoArgsConstructor
public class CathegoryClient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cath_cli;
	
	@Column(name="libelle_cathegory_produit")
	private String lib_cath_client;
	
	private Date created_at;
	private Date updated_at;
	
	
	
	public Long getId_cath_cli() {
		return id_cath_cli;
	}
	public void setId_cath_cli(Long id_cath_cli) {
		this.id_cath_cli = id_cath_cli;
	}
	public String getLib_cath_client() {
		return lib_cath_client;
	}
	public void setLib_cath_client(String lib_cath_client) {
		this.lib_cath_client = lib_cath_client;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	

}
