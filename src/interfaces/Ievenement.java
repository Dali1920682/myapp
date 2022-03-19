/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.evenement;

/**
 *
 * @author asus
 */
public interface Ievenement {

    public void ajouterEvenement(evenement e);

    public void deleteEvenement(String s);

    public void updateEvenement(evenement e, String s);

    public List<evenement> consulterEvenement();
}
