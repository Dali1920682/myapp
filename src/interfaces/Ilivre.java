/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.livre;

/**
 *
 * @author asus
 */
public interface Ilivre {
     public void ajouterLivre(livre li);
   public void deleteLivre(String s);
   public void updateLivre(livre li,String s);
   public List<livre> consulterLivre();
}
