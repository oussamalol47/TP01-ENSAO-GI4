package com.ensa.gi4.DAO;

import com.ensa.gi4.modele.Livre;

import java.util.List;

public interface DAO {
    //pour les Livres:
    public void ajouterLivre(String nomlivre );
    public List<Livre> lister();
// pour les Chaises:
    public void ajouterChaises(Integer nombre );
}
