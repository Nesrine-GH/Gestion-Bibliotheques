package com.example.gestion_biblio.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion_biblio.entites.Bibliotheque;

@RestController
@CrossOrigin("http://localhost:4200")

public interface BibliothequeRepository extends JpaRepository<Bibliotheque,Long >{
	
@RestResource(path="/byName")
public List<Bibliotheque> findByNomContains(@Param("nom") String Nom);



@RestResource(path="bynbrAdherant")
public List<Bibliotheque> findBynbrAdherantBetween(@Param("minAdh") int minAdh,@Param("maxAdh") int maxAdh);


}

