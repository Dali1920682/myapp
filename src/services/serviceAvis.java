/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.Iavis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Avis;
import util.maConnexion;

/**
 *
 * @author asus
 */
public class serviceAvis implements Iavis{
Connection cnx = maConnexion.getInstance().getCnx();
    @Override
    public void ajouterAvis(Avis a) {
       String Req = "INSERT INTO `avis`(`commentaire`, `lecteur`,`livre`) VALUES (?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(Req);
            ps.setString(1, a.getCommentaire());
            ps.setInt(2, a.getId_user());
            ps.setInt(3, a.getId_livre());
            ps.execute();
            System.out.println(" Avis ajouté avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteAvis(String s) {
        try {
            String sql = "DELETE FROM avis WHERE id_Avis=?";

            PreparedStatement statement = cnx.prepareStatement(sql);
            statement.setString(1, s);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Avis supprimé");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public void updateAvis(Avis a, String s) {
        try {
            String sql = "UPDATE avis SET commentaire=?, lecteur=?, livre=? WHERE id_Avis=?";

            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getCommentaire());
            ps.setInt(2, a.getId_user());
            ps.setInt(3, a.getId_livre());
            ps.setString(4, s);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing opinion was updated successfully!");
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<Avis> consulterAvis() {
        List<Avis> avis = new ArrayList<>();

        String query = "SELECT * FROM avis";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                avis.add(new Avis(rs.getInt("id_Avis"), rs.getString(2), rs.getInt("lecteur"), rs.getInt("livre")));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return  avis;
    }
    

public double calculAvis() {
        int total_com=0;
        List<Avis> list=consulterAvis();
        for(Avis av:list)
        {
           total_com=list.size(); 
        }
   
        return total_com;
    }


}


