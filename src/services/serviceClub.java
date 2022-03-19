/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.Iclub;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.club;
import model.utilisateur;
import util.maConnexion;

/**
 *
 * @author asus
 */
public class serviceClub implements Iclub {

    Connection cnx = maConnexion.getInstance().getCnx();

    @Override
    public void ajouterClub(club b) {
        String Req = "INSERT INTO `club`(`nom_club`, `date_creation`, `club_owner`,`membre`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(Req);
            ps.setString(1, b.getNom_club());
            ps.setString(2, b.getDate_de_creation());
            ps.setString(3, b.getClub_owner());
            ps.setInt(4, b.getNbr_members());
            ps.execute();
            System.out.println(" Club ajoutée avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteClub(String s) {
        try {
            String sql = "DELETE FROM club WHERE nom_club=?";

            PreparedStatement statement = cnx.prepareStatement(sql);
            statement.setString(1, s);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A club was deleted successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public void updateClub(club b, String s) {
         try {
        String sql = "UPDATE club SET nom_club=?, date_creation=?, club_owner=?, membre=? WHERE nom_club=?";
        
        PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, b.getNom_club());
            ps.setString(2, b.getDate_de_creation());
            ps.setString(3, b.getClub_owner());
            ps.setInt(4, b.getNbr_members());
            ps.setString(5, s);
            ps.execute();
        
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("An existing user was updated successfully!");
        }   } catch (SQLException ex) {
    }
    }

    @Override
    public List<club> consulterClub() {
         List<club> club = new ArrayList<>();
        
        String query = "SELECT * FROM club";
        
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {                
                club.add(new club(rs.getInt("id_club"), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt("membre")));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return club;
    }

}
