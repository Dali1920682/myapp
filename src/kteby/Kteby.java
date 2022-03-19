/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kteby;

import model.Avis;
import model.categorie;
import model.club;
import model.evaluation;
import model.livre;
import model.reclamation;
import model.utilisateur;
import services.serviceAvis;
import services.serviceCategorie;
import services.serviceClub;
import services.serviceEvaluation;
import services.serviceLivre;
import services.serviceReclamation;
import services.serviceUtilisateur;

/**
 *
 * @author asus
 */
public class Kteby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //users
       /* utilisateur u = new utilisateur("user", "00000000", "g@gmail.com", "ghaith", 25, "admin");
        utilisateur updated_user = new utilisateur("user", "11111111", "g@gmail.com", "bedoui", 25, "admin");

        serviceUtilisateur su = new serviceUtilisateur();

        su.ajouterUtilisateur(u);
        System.out.println(su.consulterUtilisateur());
        su.updateUtilisateur(updated_user, "user");
        su.deleteUtilisateur("user");
        
        //books
        livre li = new livre("na","na","na","na",5);
        livre updated_livre = new livre("a","a","a","a",5);
        
        serviceLivre sli = new serviceLivre();
        
        sli.ajouterLivre(li);
        sli.updateLivre(updated_livre,"na");
        System.out.println(sli.consulterLivre());
        sli.deleteLivre("na");
        */
        //avis
        Avis a = new Avis("c'est intressant",5 , 25);
        Avis updated_avis = new Avis  ("ce n'est pas interessant",5 , 25);
        
        serviceAvis  sa = new serviceAvis();
        
        /*sa.ajouterAvis(a);*/
        /*sa.updateAvis(updated_avis, "7");*/
        /*System.out.println(sa.consulterAvis());*/
         System.out.println(sa.calculAvis());
        
        /*sa.deleteAvis("10");*/
        /*
        //categorie
        categorie c = new categorie("enfant");
        categorie updated_c = new categorie("adulte");
        
        serviceCategorie sc = new serviceCategorie();
        
        sc.ajouterCategorie(c);
        sc.updateCategorie(updated_c, "enfant");
        System.out.println(sc.consulterCategorie());
        sc.deleteCategorie("adulte");*/
        
        //club
        /*club cl = new club("club","22/22/2222","me",20);
        club updated_cl = new club("club123","11/11/1111","he",30);
        
        serviceClub scl = new serviceClub();
        
        scl.ajouterClub(cl);
        scl.updateClub(updated_cl, "club");
        System.out.println(scl.consulterClub());
        scl.deleteClub("club123");*/
        
        //reclamation
        /*reclamation re = new reclamation(1,"problem","aaaaaaaaaaaaaaaaaa");
        reclamation updated_re = new reclamation(1,"ppppp","a");
        
        serviceReclamation sre = new serviceReclamation();
        
        sre.ajouterReclamation(re);
        sre.updateReclamation(updated_re, "2");
        System.out.println(sre.consulterReclamation());
        sre.deleteReclamation("2");*/
        
        //evaluation
        /*evaluation ev= new evaluation(1,2,3);
        evaluation updated_ev = new evaluation(1,2,4);
        
        serviceEvaluation sev = new serviceEvaluation();
        
        sev.ajouterEvaluation(ev);
        sev.updateEvaluation(updated_ev, "1");
        System.out.println(sev.consulterEvaluation());
        sev.deleteEvaluation("1");*/
        
    }

}
