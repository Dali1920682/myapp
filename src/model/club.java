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
public class club {
    int id_club ;
    String nom_club ;
    String date_de_creation ;
    String club_owner ;
    int nbr_members ;

    public club(String nom_club, String date_de_creation, String club_owner, int nbr_members) {
        this.nom_club = nom_club;
        this.date_de_creation = date_de_creation;
        this.club_owner = club_owner;
        this.nbr_members = nbr_members;
    }

    public club(int id_club, String nom_club, String date_de_creation, String club_owner, int nbr_members) {
        this.id_club = id_club;
        this.nom_club = nom_club;
        this.date_de_creation = date_de_creation;
        this.club_owner = club_owner;
        this.nbr_members = nbr_members;
    }

    @Override
    public String toString() {
        return "club{" + "id_club=" + id_club + ", nom_club=" + nom_club + ", date_de_creation=" + date_de_creation + ", club_owner=" + club_owner + ", nbr_members=" + nbr_members + '}';
    }

    public club() {
    }

    public void setId_club(int id_club) {
        this.id_club = id_club;
    }

    public void setNom_club(String nom_club) {
        this.nom_club = nom_club;
    }

    public void setDate_de_creation(String date_de_creation) {
        this.date_de_creation = date_de_creation;
    }

    public void setClub_owner(String club_owner) {
        this.club_owner = club_owner;
    }

    public void setNbr_members(int nbr_members) {
        this.nbr_members = nbr_members;
    }

    public int getId_club() {
        return id_club;
    }

    public String getNom_club() {
        return nom_club;
    }

    public String getDate_de_creation() {
        return date_de_creation;
    }

    public String getClub_owner() {
        return club_owner;
    }

    public int getNbr_members() {
        return nbr_members;
    }
    
}
