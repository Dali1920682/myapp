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
public class evaluation {

    int id_evaluation;
    int id_livre;
    int id_user;
    int star;

    public evaluation(int id_evaluation, int id_livre, int id_user, int star) {
        this.id_evaluation = id_evaluation;
        this.id_livre = id_livre;
        this.id_user = id_user;
        this.star = star;
    }

    public evaluation(int id_livre, int id_user, int star) {
        this.id_livre = id_livre;
        this.id_user = id_user;
        this.star = star;
    }


    public evaluation() {
    }

    public int getId_evaluation() {
        return id_evaluation;
    }

    public int getId_livre() {
        return id_livre;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public void setId_evaluation(int id_evaluation) {
        this.id_evaluation = id_evaluation;
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_user() {
        return id_user;
    }

    @Override
    public String toString() {
        return "evaluation{" + "id_evaluation=" + id_evaluation + ", id_livre=" + id_livre + ", id_user=" + id_user + ", star=" + star + '}';
    }

}
