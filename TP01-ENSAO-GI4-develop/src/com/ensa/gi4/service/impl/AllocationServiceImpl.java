package com.ensa.gi4.service.impl;

import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.AllocationService;
import org.springframework.stereotype.Component;

@Component("allocation")
public class AllocationServiceImpl implements AllocationService {
    @Override
    public void allouer(Float n) {
System.out.println("imprimante allouer pour "+n+"jours");
    }

    @Override
    public void init() {

    }

    @Override
    public void listerMateriel() {

    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {

    }

    @Override
    public void supprimerMateriel(Materiel materiel) {

    }

    @Override
    public void modifierMateriel(Materiel materiel) {

    }
}
