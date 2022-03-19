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
public class utilisateur {
    int id_user ;
    String nom_user ;
    String mot_de_passe ;
    String email ;
    String prenom ;
    int age ;
    String type ;

    public utilisateur(String nom_user, String mot_de_passe, String email, String prenom, int age, String type) {
        this.nom_user = nom_user;
        this.mot_de_passe = mot_de_passe;
        this.email = email;
        this.prenom = prenom;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "utilisateur{" + "id_user=" + id_user + ", nom_user=" + nom_user + ", mot_de_passe=" + mot_de_passe + ", email=" + email + ", prenom=" + prenom + ", age=" + age + ", type=" + type + '}';
    }

    public utilisateur(int id_user, String nom_user, String mot_de_passe, String email, String prenom, int age, String type) {
        this.id_user = id_user;
        this.nom_user = nom_user;
        this.mot_de_passe = mot_de_passe;
        this.email = email;
        this.prenom = prenom;
        this.age = age;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

   

    public utilisateur() {
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public int getId_user() {
        return id_user;
    }

    public String getNom_user() {
        return nom_user;
    }

    public String getEmail() {
        return email;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }
    
}
