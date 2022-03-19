/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.categorie;

/**
 *
 * @author asus
 */
public interface Icategorie {
   public void ajouterCategorie(categorie c);
   public void deleteCategorie(String s);
   public void updateCategorie(categorie c, String s);
    public List<categorie> consulterCategorie();
}
