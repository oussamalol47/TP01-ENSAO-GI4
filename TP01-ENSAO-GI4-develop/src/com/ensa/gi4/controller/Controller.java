package com.ensa.gi4.controller;

import java.util.Scanner;

public class Controller {
    MaterielController materiel;
    MaterielController livre;
    MaterielController chaise;
    AllocationController allocation;
    public void setGestionMaterielController(MaterielController materiel){this.materiel=materiel;}
    public void setLivreMaterielController(MaterielController livre){this.livre=livre;}
    public void setGestionChaiseController(MaterielController chaise){this.chaise=chaise;}

    public void setAllocationController(AllocationController allocation){this.allocation=allocation;}
    public void affichermenu(){

        System.out.println("1- pour choisir le matériel entrer 1");
        System.out.println("2- pour choisir les Livres 2");
        System.out.println("3- pour choisir allocation imprimante 3");
        System.out.println("4- pour choisir les Chaises 4");


        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("1".equals(next)) {
            materiel.afficherMenu();
        } else if ("2".equals(next)) {
            livre.afficherMenu();}
        else if ("3".equals(next)) {
            allocation.Allocation();}
        else if ("4".equals(next)) {
            chaise.afficherMenu();}
       else {
            System.out.println("choix invalide");
        }
    }
    }

