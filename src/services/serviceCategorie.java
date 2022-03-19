/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.Icategorie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Avis;
import model.categorie;
import model.livre;
import util.maConnexion;

/**
 *
 * @author asus
 */
public class serviceCategorie implements Icategorie{
Connection cnx = maConnexion.getInstance().getCnx();
    @Override
    public void ajouterCategorie(categorie c) {
        String Req = "INSERT INTO `categorie`(`nom_categorie`) VALUES (?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(Req);
            ps.setString(1, c.getNom_categorie()
            );
            ps.execute();
            System.out.println(" Categorie ajoutée avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteCategorie(String s) {
        try {
            String sql = "DELETE FROM categorie WHERE nom_categorie=?";

            PreparedStatement statement = cnx.prepareStatement(sql);
            statement.setString(1, s);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A category was deleted successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public void updateCategorie(categorie c, String s) {
        try {
            String sql = "UPDATE categorie SET nom_categorie=? WHERE nom_categorie=?";

            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, c.getNom_categorie());
            ps.setString(2, s);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing category was updated successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<categorie> consulterCategorie() {
        List<categorie> categorie = new ArrayList<>();

        String query = "SELECT * FROM categorie";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                categorie.add(new categorie(rs.getInt("id_categorie"), rs.getString(2)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return categorie;
    }
    }
