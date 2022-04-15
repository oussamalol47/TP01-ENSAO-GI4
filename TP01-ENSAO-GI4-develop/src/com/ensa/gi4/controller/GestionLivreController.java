package com.ensa.gi4.controller;

import com.ensa.gi4.service.api.GestionLivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component("livrecont")
public class GestionLivreController implements MaterielController {

    private GestionLivreService gestionLivreService;
@Override
    public void listerMateriel() {
        gestionLivreService.listerMateriel();
    }
    @Override
    public void afficherMenu() {
        System.out.println("1- pour lister le livre, entrer 1");
        System.out.println("2- pour ajouter un nouveau livre, entrer 2");
        System.out.println("0- pour sortir de l'application, entrer 0");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
            listerMateriel();
        } else if ("2".equals(next)) {
            System.out.println("Entrez le nom du livre");
            Scanner scan = new Scanner(System.in);
            String nom = scanner.next();
            gestionLivreService.ajouterNouveauMateriel(nom);
            // ajouter nouveau matériel
        } else {
            System.out.println("choix invalide");
        }
    }
    @Override
    public void sortirDeLApplication() {
        System.exit(0);
    }

    @Autowired
    @Qualifier("livre")
    public void setGestionLivreService(GestionLivreService gestionLivreService) {
        // injection par accesseur
        this.gestionLivreService = gestionLivreService;
    }
}
