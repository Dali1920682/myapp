/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.evaluation;

/**
 *
 * @author asus
 */
public interface Ievaluation {
    public void ajouterEvaluation(evaluation e);
   public void deleteEvaluation(String s);
   public void updateEvaluation(evaluation e, String s);
   public List<evaluation> consulterEvaluation();
}
