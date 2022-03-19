/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.Ievaluation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.evaluation;
import util.maConnexion;

/**
 *
 * @author asus
 */
public class serviceEvaluation implements Ievaluation{
Connection cnx = maConnexion.getInstance().getCnx();
    @Override
    public void ajouterEvaluation(evaluation e) {
       String Req = "INSERT INTO `evaluation`(`id_livre`, `id_user`, `stars`) VALUES (?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(Req);
            ps.setInt(1, e.getId_livre());
            ps.setInt(2, e.getId_user());
            ps.setInt(3, e.getStar());
            ps.execute();
            System.out.println(" Evaluation ajoutée avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEvaluation(String s) {
        try {
            String sql = "DELETE FROM evaluation WHERE id_evaluation=?";

            PreparedStatement statement = cnx.prepareStatement(sql);
            statement.setString(1, s);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A book was deleted successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public void updateEvaluation(evaluation e, String s) {
        try {
            String sql = "UPDATE evaluation SET stars=? WHERE id_evaluation=?";

            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setInt(1, e.getStar());
            ps.setString(2, s);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing evaluation was updated successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<evaluation> consulterEvaluation() {
        List<evaluation> evaluation = new ArrayList<>();

        String query = "SELECT * FROM evaluation";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                evaluation.add(new evaluation(rs.getInt("id_evaluation"), rs.getInt("id_livre"), rs.getInt("id_user"), rs.getInt("stars")));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return evaluation;
    }
    }
