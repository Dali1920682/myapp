/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Avis;
import model.club;

/**
 *
 * @author asus
 */
public interface Iclub {
     public void ajouterClub(club b);
   public void deleteClub(String s);
   public void updateClub(club b, String s);
   public List<club> consulterClub();
}
