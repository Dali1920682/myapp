/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author asus
 */
public class evenement {
    int id_event ; 
    String evnt_name ;
    String description ;
    String evnt_date ;
    int id_club ;

    public evenement(String evnt_name, String description, String evnt_date, int id_club) {
        this.evnt_name = evnt_name;
        this.description = description;
        this.evnt_date = evnt_date;
        this.id_club = id_club;
    }

    public evenement(int id_event, String evnt_name, String description, String evnt_date, int id_club) {
        this.id_event = id_event;
        this.evnt_name = evnt_name;
        this.description = description;
        this.evnt_date = evnt_date;
        this.id_club = id_club;
    }

    @Override
    public String toString() {
        return "evenement{" + "id_event=" + id_event + ", evnt_name=" + evnt_name + ", description=" + description + ", evnt_date=" + evnt_date + ", id_club=" + id_club + '}';
    }

    public evenement() {
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public void setEvnt_name(String evnt_name) {
        this.evnt_name = evnt_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEvnt_date(String evnt_date) {
        this.evnt_date = evnt_date;
    }

    public void setId_club(int id_club) {
        this.id_club = id_club;
    }

    public int getId_event() {
        return id_event;
    }

    public String getEvnt_name() {
        return evnt_name;
    }

    public String getDescription() {
        return description;
    }

    public String getEvnt_date() {
        return evnt_date;
    }

    public int getId_club() {
        return id_club;
    }
    
    
}
