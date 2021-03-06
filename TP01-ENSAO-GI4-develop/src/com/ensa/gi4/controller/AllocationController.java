package com.ensa.gi4.controller;

import com.ensa.gi4.service.api.AllocationService;
import com.ensa.gi4.service.impl.AllocationServiceImpl;
import com.ensa.gi4.service.impl.GestionMaterielServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component("allocationcont")
public class AllocationController implements MaterielController {
    public AllocationService allocationService;

public void Allocation(){
   try {
       System.out.println("Donnez le nombre de jours");
       Scanner scanner = new Scanner(System.in);
       Float next = scanner.nextFloat();
       allocationService.allouer(next);
   }catch ( Exception e1){ System.out.println("Il faut saisir un nombre");}


}
    @Override
    public void listerMateriel() {

    }

    @Override
    public void afficherMenu() {

    }

    @Override
    public void sortirDeLApplication() {

    }


    @Autowired
    @Qualifier("allocation")
    public void setAllocationService(AllocationServiceImpl allocationService) {
    this.allocationService=allocationService;
    }
}
