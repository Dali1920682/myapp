/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.utilisateur;

/**
 *
 * @author asus
 */
public interface Iutilisateur {
     public void ajouterUtilisateur(utilisateur u);
   public void deleteUtilisateur(String s);
   public void updateUtilisateur(utilisateur u,String s);
   public List<utilisateur> consulterUtilisateur();
}
