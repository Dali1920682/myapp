/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.reclamation;

/**
 *
 * @author asus
 */
public interface Ireclamation {
    public void ajouterReclamation(reclamation e);

    public void deleteReclamation(String s);

    public void updateReclamation(reclamation e, String s);

    public List<reclamation> consulterReclamation();
}

