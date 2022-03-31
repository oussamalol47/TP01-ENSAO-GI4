package com.ensa.gi4.service.impl;

import com.ensa.gi4.DAO.DAOImpl;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionLivreService;

import java.util.List;

public class GestionLivreServiceImpl implements GestionLivreService {
 DAOImpl DAO;
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

    @Override
    public void ajouterNouveauMateriel(String nom) {
DAO.ajouterLivre(nom);
    }

    @Override
    public void supprimerMateriel(Materiel materiel) {

    }

    @Override
    public void modifierMateriel(Materiel materiel) {

    }
}
