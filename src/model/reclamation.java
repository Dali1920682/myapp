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
public class reclamation {
    int id_reclamation ;
    int id_user ;
    String titre ;
    String description ;

    public reclamation(int id_user, String titre, String description) {
        this.id_user = id_user;
        this.titre = titre;
        this.description = description;
    }

    public reclamation(int id_reclamation, int id_user, String titre, String description) {
        this.id_reclamation = id_reclamation;
        this.id_user = id_user;
        this.titre = titre;
        this.description = description;
    }

    public reclamation() {
    }

    public void setId_reclamation(int id_reclamation) {
        this.id_reclamation = id_reclamation;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_reclamation() {
        return id_reclamation;
    }

    public int getId_user() {
        return id_user;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "reclamation{" + "id_reclamation=" + id_reclamation + ", id_user=" + id_user + ", titre=" + titre + ", description=" + description + '}';
    }
    
}
