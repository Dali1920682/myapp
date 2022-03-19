/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.Ilivre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.livre;
import util.maConnexion;

/**
 *
 * @author asus
 */
public class serviceLivre implements Ilivre {

    Connection cnx = maConnexion.getInstance().getCnx();

    @Override
    public void ajouterLivre(livre li) {
        String Req = "INSERT INTO `livre`(`titre`, `auteur`, `description`,`image`,`categorie`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(Req);
            ps.setString(1, li.getTitre());
            ps.setString(2, li.getAuteur());
            ps.setString(3, li.getDescription());
            ps.setString(4, li.getImage());
            ps.setInt(5, li.getId_cat());
            ps.execute();
            System.out.println(" Livre ajoutée avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteLivre(String s) {
        try {
            String sql = "DELETE FROM livre WHERE titre=?";

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
    public void updateLivre(livre li, String s) {
        try {
            String sql = "UPDATE livre SET titre=?, auteur=?, description=?, image=?, categorie=? WHERE titre=?";

            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, li.getTitre());
            ps.setString(2, li.getAuteur());
            ps.setString(3, li.getDescription());
            ps.setString(4, li.getImage());
            ps.setInt(5, li.getId_cat());
            ps.setString(6, s);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing book was updated successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<livre> consulterLivre() {
        List<livre> livre = new ArrayList<>();

        String query = "SELECT * FROM livre";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                livre.add(new livre(rs.getInt("id_livre"), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt("categorie")));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return livre;
    }

}
