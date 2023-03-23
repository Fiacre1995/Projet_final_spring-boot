package com.example.demo.modeles;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

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
@Table(name="caisse")
@AllArgsConstructor
@NoArgsConstructor
public class Caisse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_caiss;
	
	@Column(name="Numero_caisse", length = 50)
	private String num_caiss;
	
	@Column(updatable = false)
	private String  created_at;
	private String  updated_at;




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

	public Long getId_caiss() {
		return id_caiss;
	}

	public void setId_caiss(Long id_caiss) {
		this.id_caiss = id_caiss;
	}

	public String getNum_caiss() {
		return num_caiss;
	}

	public void setNum_caiss(String num_caiss) {
		this.num_caiss = num_caiss;
	}

	
	
	
	

}
