package com.example.gestion_biblio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion_biblio.entites.Livre;

@RestController
	
	public interface LivreRepository extends JpaRepository<Livre, Long>{

	}

