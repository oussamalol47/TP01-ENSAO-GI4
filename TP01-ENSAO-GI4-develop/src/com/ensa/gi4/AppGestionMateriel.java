package com.ensa.gi4;

import com.ensa.gi4.controller.Controller;
import com.ensa.gi4.controller.GestionLivreController;
import com.ensa.gi4.controller.GestionMaterielController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("all")
public class AppGestionMateriel {
    private static final ApplicationContext APPLICATION_CONTEXT;

    static { // bloc static pour initilialisation
        APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("/beans/app-context.xml");
    }

    public static void main(String[] args) {
        final Controller Controller = APPLICATION_CONTEXT.getBean(Controller.class);

        while (true) { // pour que l'appliation tourne jusqu'à la demande de l'utilisateur de l'arrêter
            Controller.affichermenu();
        }

    }
}
