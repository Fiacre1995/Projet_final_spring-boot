package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modeles.Utilisateurs;


public interface UtilisateurRepository extends JpaRepository<Utilisateurs, Long> {
	/*
	 Optional<Utilisateurs>  findByEmail_userAndPassword_user(String email_user, String password_user);
	 */

}
