package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modeles.Clients;
public interface ClientRepository extends JpaRepository<Clients, Long> {

}
