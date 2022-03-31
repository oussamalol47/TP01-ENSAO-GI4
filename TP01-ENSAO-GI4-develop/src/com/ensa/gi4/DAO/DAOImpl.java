package com.ensa.gi4.DAO;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO{
    List<Livre> livres = new ArrayList<Livre>();
    List<Chaise> chaises = new ArrayList<Chaise>();

    public DAOImpl(){
       //Livres deja existants
        Livre a=new Livre();
        a.setNom("livreA");
        Livre b=new Livre();
        b.setNom("livreB");
        Livre c=new Livre();
        c.setNom("livreC");
        livres.add(a);livres.add(b);livres.add(c);
        //Chaises deja existantes
        Chaise x=new Chaise();
        x.setNom("chaise1");
        Chaise y=new Chaise();
        y.setNom("chaise2");
        Chaise z=new Chaise();
        z.setNom("chaise3");
        chaises.add(x);chaises.add(y);chaises.add(z);
    }
    @Override
    public void ajouterLivre(String livrenom) {
       Livre livre =new Livre();
       livre.setNom(livrenom);
        this.livres.add(livre);
    }

    @Override
    public List<Livre> lister() {
        return this.livres;
    }

    @Override
    public void ajouterChaises(Integer nombre) {
for (int i=0 ;i<nombre;i++) {
    Chaise a=new Chaise();
    a.setNom("chaise");
    chaises.add(a);

} }
    public List<Chaise> listerchaises() {
        return this.chaises;
    }
}
