package com.example.demo.modeles;

import java.io.Serializable;
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
@Table(name="boutique")
@AllArgsConstructor
@NoArgsConstructor
public class Boutique implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_bout;
	
	@Column(name="libelle_boutique")
	private String lib_bout;
	
	@Column(name="ville_boutique")
	private String ville_bout;
	
	private Date created_at;
	private Date updated_at;
	
	

	public Long getId_bout() {
		return id_bout;
	}

	public void setId_bout(Long id_bout) {
		this.id_bout = id_bout;
	}

	public String getLib_bout() {
		return lib_bout;
	}

	public void setLib_bout(String lib_bout) {
		this.lib_bout = lib_bout;
	}

	public String getVille_bout() {
		return ville_bout;
	}

	public void setVille_bout(String ville_bout) {
		this.ville_bout = ville_bout;
	}
	

	
}
