package com.example.gestion_biblio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.gestion_biblio.dao.BibliothequeRepository;
import com.example.gestion_biblio.dao.LivreRepository;
import com.example.gestion_biblio.entites.Bibliotheque;
import com.example.gestion_biblio.entites.Livre;



@SpringBootApplication
public class BibliothequeApplication implements CommandLineRunner{

	@Autowired
	private BibliothequeRepository br;
	
	@Autowired
	private RepositoryRestConfiguration rrc;
	
	@Autowired
	private LivreRepository lr;
	
	public static void main(String[] args) {
		SpringApplication.run(BibliothequeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		rrc.exposeIdsFor(Bibliotheque.class);
		
		//Creation des bibliotheques
		
		Bibliotheque b1 = new Bibliotheque(null,"https://metropoletpm.fr/sites/new.tpm-agglo.fr/files/styles/contenu/public/chalucet_mediatheque_interieur_op_z2a1306.jpg?itok=7xdJGN9l","La médiathèque Chalucet","La nouvelle médiathèque Chalucet réalisée sous maîtrise d’ouvrage de la ville de Toulon",100,null);
		Bibliotheque b2 = new Bibliotheque(null,"https://www.frequence-sud.fr/admin/transfert_lieu/data/3727.jpg","Médiathèque Sainte-Musse","Une offre documentaire variée et actualisée se déploie sur 120 m².",66,null);
		Bibliotheque b3 = new Bibliotheque(null,"https://toulon.fr/sites/new.toulon.fr/files/2012-04-04-alb-0020.jpg","Bibliothèque Roseraie","Dès 1988, elle est la première bibliothèque de la ville à proposer un fonds musical. Depuis, la médiathèque La Roseraie n’a jamais cessé de développer et enrichir ses collections.",7,null);		
		Bibliotheque b4 = new Bibliotheque(null,"https://www.hyeres-tourisme.com/wp-content/uploads/wpetourisme/11657908-diaporama-scaled.jpg","Bibliothèque Pauline Roland","Inscription avec pièce d’identité, justificatif de domicile et autorisation parentale pour les enfants mineurs.",50,null);
	
		br.save(b1);
		br.save(b2);
		br.save(b3);
		br.save(b4);

		br.findAll().forEach(b->{;
		for (int l=0;l<10;l++) {
			
			lr.save(new Livre(null,"livre"+l,b));

		}
		});
				}
}