/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.Ireclamation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.reclamation;
import util.maConnexion;

/**
 *
 * @author asus
 */
public class serviceReclamation implements Ireclamation {

        Connection cnx = maConnexion.getInstance().getCnx();
        
    @Override
    public void ajouterReclamation(reclamation e) {
        String Req = "INSERT INTO `reclamation`(`id_user`, `titre`, `description`) VALUES (?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(Req);
            ps.setInt(1, e.getId_user());
            ps.setString(2, e.getTitre());
            ps.setString(3, e.getDescription());
            ps.execute();
            System.out.println(" Reclamation ajoutée avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteReclamation(String s) {
        try {
            String sql = "DELETE FROM reclamation WHERE id_reclamation=?";

            PreparedStatement statement = cnx.prepareStatement(sql);
            statement.setString(1, s);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A reclamation was deleted successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public void updateReclamation(reclamation e, String s) {
       try {
            String sql = "UPDATE reclamation SET id_user=?, titre=?, description=? WHERE id_reclamation=?";

            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setInt(1, e.getId_user());
            ps.setString(2, e.getTitre());
            ps.setString(3, e.getDescription());
            ps.setString(4, s);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("A reclamation user was updated successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<reclamation> consulterReclamation() {
        List<reclamation> reclamation = new ArrayList<>();

        String query = "SELECT * FROM reclamation";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                reclamation.add(new reclamation(rs.getInt("id_reclamation"), rs.getInt("id_user"), rs.getString(3), rs.getString(4)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return reclamation;
    }
    }

