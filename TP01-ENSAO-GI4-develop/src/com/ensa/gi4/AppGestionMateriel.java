package com.ensa.gi4;

import com.ensa.gi4.controller.Controller;
import com.ensa.gi4.controller.GestionLivreController;
import com.ensa.gi4.controller.GestionMaterielController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;



@ComponentScan(basePackages = {"com.ensa.gi4"})
public class AppGestionMateriel {
    private static final ApplicationContext APPLICATION_CONTEXT;

    static { // bloc static pour initilialisation
        APPLICATION_CONTEXT = new AnnotationConfigApplicationContext(AppGestionMateriel.class);
    }

    public static void main(String[] args) {
        final Controller Controller = APPLICATION_CONTEXT.getBean(com.ensa.gi4.controller.Controller.class);

        while (true) { // pour que l'appliation tourne jusqu'à la demande de l'utilisateur de l'arrêter
            Controller.affichermenu();
        }

    }
}
