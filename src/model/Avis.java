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
public class Avis {
    int id_Avis;
    String commentaire ;
    int id_user;
    int id_livre;

    public Avis(int id_Avis, String commentaire, int id_user, int id_livre) {
        this.id_Avis = id_Avis;
        this.commentaire = commentaire;
        this.id_user = id_user;
        this.id_livre = id_livre;
    }

    public Avis() {
    }

    @Override
    public String toString() {
        return "Avis{" + "id_Avis=" + id_Avis + ", commentaire=" + commentaire + ", id_user=" + id_user + ", id_livre=" + id_livre + '}';
    }

    public Avis(String commentaire, int id_user, int id_livre) {
        this.commentaire = commentaire;
        this.id_user = id_user;
        this.id_livre = id_livre;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_livre() {
        return id_livre;
    }

    public Avis(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setId_Avis(int id_Avis) {
        this.id_Avis = id_Avis;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getId_Avis() {
        return id_Avis;
    }

    public String getCommentaire() {
        return commentaire;
    }
}
