package com.example.gestion_biblio.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Livre {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;

@ManyToOne
private Bibliotheque bibliotheque;

                   //Constructeur avec parametres
public Livre(Long id, String title, Bibliotheque bibliotheque) {
	super();
	this.id = id;
	this.title = title;
	this.bibliotheque = bibliotheque;
}

                  //Constructeur sans parametres
public Livre() {
	super();

}


                  //Getteurs et Setteurs
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Bibliotheque getBibliotheque() {
	return bibliotheque;
}

public void setBibliotheque(Bibliotheque bibliotheque) {
	this.bibliotheque = bibliotheque;
}


}
