package com.example.demo.modeles;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="utilisateur")
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateurs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_user;
	
	@Column(name="nom_utilisateur", length = 20)
	private String lastname_user;
	
	@Column(name="prenoms_utilisateur", length = 50)
	private String firstname_user;
	
	@Column(name="email_utilisateur", length = 50)
	private String email_user;
	
	@Column(name="Mot_de_passe_utilisateur", length = 20)
	private String password_user;
	
	@Column(name="Role_utilisateur", length = 20)
	private String role_user;
	
	public String getEmail_user() {
		return email_user;
	}

	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}

	public String getRole_user() {
		return role_user;
	}

	public void setRole_user(String role_user) {
		this.role_user = role_user;
	}

	@Column(name="Sexe_utilisateur", length = 20)
	private char sex_user;
	
	@Column(updatable = false)
	private String created_at;
	private String updated_at;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_bout")
	private Boutique id_bout_fk;

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public String getLastname_user() {
		return lastname_user;
	}

	public void setLastname_user(String lastname_user) {
		this.lastname_user = lastname_user;
	}

	public String getFirstname_user() {
		return firstname_user;
	}

	public void setFirstname_user(String firstname_user) {
		this.firstname_user = firstname_user;
	}

	public String getPassword_user() {
		return password_user;
	}

	public void setPassword_user(String password_user) {
		this.password_user = password_user;
	}

	public char getSex_user() {
		return sex_user;
	}

	public void setSex_user(char sex_user) {
		this.sex_user = sex_user;
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

	public Boutique getId_bout_fk() {
		return id_bout_fk;
	}

	public void setId_bout_fk(Boutique id_bout_fk) {
		this.id_bout_fk = id_bout_fk;
	}
	
	
	
	
	
	

}
