/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author asus
 */
public class livre {
    int id_livre ;
    String titre;
    String auteur;
    String description ;
    String image ;
    int id_cat;

    public livre(String titre, String auteur, String description, String image, int id_cat) {
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
        this.image = image;
        this.id_cat = id_cat;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public livre(int id_livre, String titre, String auteur, String description, String image, int id_cat) {
        this.id_livre = id_livre;
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
        this.image = image;
        this.id_cat = id_cat;
    }

    
    public livre() {
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId_livre() {
        return id_livre;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "livre{" + "id_livre=" + id_livre + ", titre=" + titre + ", auteur=" + auteur + ", description=" + description + ", image=" + image + ", id_cat=" + id_cat + '}';
    }
    
}
