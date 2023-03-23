package com.example.demo.modeles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="reduction")
@AllArgsConstructor
@NoArgsConstructor
public class Reductions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_reduc;
	
	@Column(name="statut_reduction", length = 20)
	private boolean statut_reduc;

	public Long getId_reduc() {
		return id_reduc;
	}

	public void setId_reduc(Long id_reduc) {
		this.id_reduc = id_reduc;
	}

	public boolean isStatut_reduc() {
		return statut_reduc;
	}

	public void setStatut_reduc(boolean statut_reduc) {
		this.statut_reduc = statut_reduc;
	}
	
	
	
}
