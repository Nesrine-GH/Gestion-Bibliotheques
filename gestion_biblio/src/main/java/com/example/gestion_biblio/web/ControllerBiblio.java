package com.example.gestion_biblio.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion_biblio.dao.BibliothequeRepository;
import com.example.gestion_biblio.entites.Bibliotheque;



@RestController
public class ControllerBiblio {

	@Autowired
	private BibliothequeRepository brpy;
	
	// GET 
	
	@RequestMapping(value="/getbibliotheques/{id}",method = RequestMethod.GET)
	public Bibliotheque getbibliotheques(@PathVariable Long id, @RequestBody Bibliotheque b ) {
		return brpy.getById(id);
	}
	
	
	// Edit+Update
	
	@RequestMapping(value="/editbibliotheques/{id}",method = RequestMethod.PUT)
	public Bibliotheque editbibliotheques(@PathVariable Long id, @RequestBody Bibliotheque b ) {
		b.setId(id);
		return brpy.save(b);
	}
	
	// POST
	
	@RequestMapping(value="/addbibliotheques",method = RequestMethod.POST)
	public Bibliotheque addbibliotheques(@PathVariable Long id, @RequestBody Bibliotheque b ) {
		return brpy.save(b);
	}
	
	// delete
	
	@RequestMapping(value="/deletebibliotheques/{id}",method = RequestMethod.DELETE)
	public boolean deletebibliotheques(@PathVariable Long id ) {
	 brpy.deleteById(id);
	return true;
	}
	}
	



