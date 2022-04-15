package com.ensa.gi4.service.impl;

import com.ensa.gi4.DAO.DAOImpl;
import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionChaiseService;
import com.ensa.gi4.service.api.GestionLivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("chaise")
public class GestionChaiseServiceImpl implements GestionChaiseService {
    DAOImpl DAO;

    @Autowired
    public void setDAO(DAOImpl Daoimpl){
        this.DAO=Daoimpl;
    }
    @Override
    public void init() {
        System.out.println("inititialisation du service des Chaises");
    }

    @Override
    public void listerMateriel() {
        List<Chaise> chaises =DAO.listerchaises();

            System.out.println("Le nombre de chaises existant est :"+chaises.size());


    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {

    }

    @Override
    public void ajouterNouveauMateriel(Integer nombre) {
        DAO.ajouterChaises(nombre);
    }

    @Override
    public void supprimerMateriel(Materiel materiel) {

    }

    @Override
    public void modifierMateriel(Materiel materiel) {

    }
}
