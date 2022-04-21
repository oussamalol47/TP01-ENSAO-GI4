package com.ensa.gi4.service.impl;

import com.ensa.gi4.DAO.DAOImpl;
import com.ensa.gi4.listeners.LivreEvent;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionLivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("livre")
public class GestionLivreServiceImpl implements GestionLivreService, ApplicationEventPublisherAware {
 DAOImpl DAO;
    private ApplicationEventPublisher publisher;
 @Autowired
 public void setDAO(DAOImpl Daoimpl){
     this.DAO=Daoimpl;
 }
    @Override
    public void init() {
        System.out.println("inititialisation du service Livres");
    }

    @Override
    public void listerMateriel() {
     List<Livre> livres =DAO.lister();
        for (Livre l:livres) {
            System.out.println(l.getNom());
        }

    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {

    }
//publier event ajouter un livre
    @Override
    public void ajouterNouveauMateriel(String nom) {

publisher.publishEvent(new LivreEvent(this,"ajout",nom));
     DAO.ajouterLivre(nom);
    }

    @Override
    public void supprimerMateriel(Materiel materiel) {

    }

    @Override
    public void modifierMateriel(Materiel materiel) {

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
