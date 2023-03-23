package com.example.demo.modeles;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id_prod")

public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_prod;
	
	@Column(name="Adresse_mail_utilisateur", length = 50)
	private String email_user;
	
	public Long getId_prod() {
		return id_prod;
	}

	public void setId_prod(Long id_prod) {
		this.id_prod = id_prod;
	}

	public String getEmail_user() {
		return email_user;
	}

	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}

	public String getPassword_user() {
		return password_user;
	}

	public void setPassword_user(String password_user) {
		this.password_user = password_user;
	}

	@Column(name="Mot_de_passe_utilisateur", length = 50)
	private String password_user;

}
