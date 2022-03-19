/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.Ievenement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.evenement;
import util.maConnexion;

/**
 *
 * @author asus
 */
public class serviceEvent implements Ievenement {

    Connection cnx = maConnexion.getInstance().getCnx();

    @Override
    public void ajouterEvenement(evenement e) {
        String Req = "INSERT INTO `utilisateur`(`evnt_name`, `description`, `evnt_date`,`evnt_club`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(Req);
            ps.setString(1, e.getEvnt_name());
            ps.setString(2, e.getDescription());
            ps.setString(3, e.getEvnt_date());
            ps.setInt(4, e.getId_club());
            ps.execute();
            System.out.println(" Utilisateur ajoutée avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEvenement(String s) {
            try {
        String sql = "DELETE FROM evenement WHERE evnt_name=?";
        
        PreparedStatement statement = cnx.prepareStatement(sql);
        statement.setString(1, s);
        
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("An event was deleted successfully!");
        }   } catch (SQLException ex) {
    }
    }

    @Override
    public void updateEvenement(evenement e, String s) {
        try {
            String sql = "UPDATE evenement SET evnt_name=?, description=?, evnt_date=?, evnt_club=? WHERE evnt_name=?";

            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, e.getEvnt_name());
            ps.setString(2, e.getDescription());
            ps.setString(3, e.getEvnt_date());
            ps.setInt(4, e.getId_club());
            ps.setString(5, s);
            ps.execute();

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing event was updated successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<evenement> consulterEvenement() {
        List<evenement> evnt = new ArrayList<>();

        String query = "SELECT * FROM evenement";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                evnt.add(new evenement(rs.getInt("id_event"), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt("evnt_club")));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return evnt;
    }
}
