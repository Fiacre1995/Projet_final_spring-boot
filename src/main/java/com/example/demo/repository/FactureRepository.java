package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modeles.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long>{

}
