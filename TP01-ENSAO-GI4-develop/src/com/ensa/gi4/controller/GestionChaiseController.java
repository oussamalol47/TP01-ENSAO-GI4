package com.ensa.gi4.controller;

import com.ensa.gi4.service.api.GestionChaiseService;
import com.ensa.gi4.service.api.GestionLivreService;

import java.util.Scanner;

public class GestionChaiseController implements MaterielController {

    private GestionChaiseService gestionChaiseService;
    @Override
    public void listerMateriel() {
        gestionChaiseService.listerMateriel();
    }
    @Override
    public void afficherMenu() {
        System.out.println("1- pour lister les chaises, entrer 1");
        System.out.println("2- pour ajouter Des chaises, entrer 2");
        System.out.println("0- pour sortir de l'application, entrer 0");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
            listerMateriel();
        } else if ("2".equals(next)) {
            System.out.println("Entrez le nombre de chaises a ajouter");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()){
                Integer nombre= scan.nextInt();
            gestionChaiseService.ajouterNouveauMateriel(nombre);}
            // ajouter nouveau matériel
        } else {
            System.out.println("choix invalide");
        }
    }
    @Override
    public void sortirDeLApplication() {
        System.exit(0);
    }


    public void setGestionChaiseService(GestionChaiseService gestionChaiseService) {
        // injection par accesseur
        this.gestionChaiseService = gestionChaiseService;
    }
}
