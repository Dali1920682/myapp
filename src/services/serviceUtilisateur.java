/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.Iutilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.utilisateur;
import util.maConnexion;

/**
 *
 * @author asus
 */
public class serviceUtilisateur implements Iutilisateur{
Connection cnx = maConnexion.getInstance().getCnx();
    @Override
    public void ajouterUtilisateur(utilisateur u) {
        String Req = "INSERT INTO `utilisateur`(`email`, `nom_utilisateur`, `mdp`,`prenom_utilisateur`,`age`,`type`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(Req);
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getNom_user());
            ps.setString(3, u.getMot_de_passe());
            ps.setString(4, u.getPrenom());
            ps.setInt(5, u.getAge());
            ps.setString(6, u.getType());
            ps.execute();
            System.out.println(" Utilisateur ajoutée avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteUtilisateur(String s) {
    try {
        String sql = "DELETE FROM utilisateur WHERE nom_utilisateur=?";
        
        PreparedStatement statement = cnx.prepareStatement(sql);
        statement.setString(1, s);
        
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("A user was deleted successfully!");
        }   } catch (SQLException ex) {
    }
    }

    @Override
    public void updateUtilisateur(utilisateur u, String s) {
    try {
        String sql = "UPDATE utilisateur SET email=?, nom_utilisateur=?, mdp=?, prenom_utilisateur=?, age=?, type=? WHERE nom_utilisateur=?";
        
        PreparedStatement statement = cnx.prepareStatement(sql);
        statement.setString(1, u.getEmail());
        statement.setString(2, u.getNom_user());
        statement.setString(3, u.getMot_de_passe());
        statement.setString(4, u.getPrenom());
        statement.setInt(5, u.getAge());
        statement.setString(6, u.getType());
        statement.setString(7, s);
        
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("An existing user was updated successfully!");
        }   } catch (SQLException ex) {
    }
    }

    @Override
    public List<utilisateur> consulterUtilisateur() {
           List<utilisateur> utilisateur = new ArrayList<>();
        
        String query = "SELECT * FROM utilisateur";
        
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {                
                utilisateur.add(new utilisateur(rs.getInt("id_user"), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getInt("age"),rs.getString(7)));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return utilisateur;
    }
    
}
