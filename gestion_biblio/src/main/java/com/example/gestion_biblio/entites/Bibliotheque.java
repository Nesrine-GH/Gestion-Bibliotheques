package com.example.gestion_biblio.entites;



import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity

public class Bibliotheque {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String photo;
private String nom;
private String description;
private int nbrAdherant;
@OneToMany (mappedBy = "bibliotheque")
private Collection<Livre> Livres;


       //Constructeur avec parametres

public Bibliotheque(Long id, String photo, String nom, String description, int nbrAdherant,
		Collection<Livre> livres) {
	super();
	this.id = id;
	this.photo = photo;
	this.nom = nom;
	this.description = description;
	this.nbrAdherant = nbrAdherant;
	this.Livres = livres;
}
	  //Constructeur sans parametres
	public Bibliotheque() {
		super();
		
	}
	
	

	//Getteurs et Setteurs
public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getPhoto() {
	return photo;
}


public void setPhoto(String photo) {
	this.photo = photo;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public int getNbrAdherant() {
	return nbrAdherant;
}

public void setNbrAdherant(int nbrAdherant) {
	this.nbrAdherant = nbrAdherant;
}

public Collection<Livre> getLivres() {
	return Livres;
}


public void setLivres(Collection<Livre> livres) {
	Livres = livres;
}


}










