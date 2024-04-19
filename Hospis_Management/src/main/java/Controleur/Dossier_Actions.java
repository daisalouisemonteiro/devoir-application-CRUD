/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class Dossier_Actions {
     // AJOUTER Dosier
    public void ajouter(Dossier d){
        //1.SE CONNECTER A LA BASE
        connexion_Base cb=new connexion_Base();
        cb.connect();
        
        //2.REQUETE SQL
        String rep="insert into Dowssier (dateCreation,nature_Examen,Date_Examen, Observations,codeP) values('"+d.getdatecreation()+"','"+d.getnature_Examen()+"','"+d.getDate-Examen()+"','"+d.getObservations()+"''"+p.getcodeP()+"'";
        
        //3.EXECUTER LA REQUETE
        cb.st.executeUpdate(rep);
        JOptionPane.showMessageDialog(null,"Enregistrement effectuer avec succes");
    }
    //MODIFIER Dossier
    public static void modifier(Dossier d){
        try {
            //1.SE CONNECTER A LA BASE
            connexion_Base cb=new connexion_Base();
            cb.connect();
            //2.REQUETE SQL
            String rep="update Dossier set dateCreation='"+p.getdateCreation()+"',nature_Examen='"+p.nature_Examen()+"',Date_Examen='"+p.getDate_Examen()+"',Observations='"+p.getObservations()+"',codeP='"+p.getcodeP()+"',where Id='"+p.getId()+"'";
            //EXECUTER
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //SUPPRIMER Dossier
    
    public void supprimer(int Id){
        //SE CONNECTER à la base
        connexion_Base cb=new connexion_Base();
        cb.connect();
        String Id = null;
        //REQUETE
        String rep="'delete from Dossier where Id ='"+Id+"'";
        //EXECUTER LA REQUETE
        cb.st.executeUpdate(rep);
        JOptionPane.showMessageDialog(null,"Suppression avec succés ");
    }
    
    
    
    //RECHERCHER Dossier
    //FONCTION 
    public Dossier rechercher (int Id){
        Dossier d=null;
        try {
            //SE CONNECTER
            connexion_Base cb=new connexion_Base();
            cb.connect();
            //REQUETE
            String rep="Select*from Dossier where Id='"+Id+"'";
            //EXECUTER
            ResultSet rs=cb.st.executeQuery(rep);
            //verifier si on a trouver
            if(rs.next()){
                d.setId(rs.getInt("id"));
                d.setdateCreation(rs.getString("dateCreation"));
                d.setnature_Examen(rs.getString("natur_Examen"));
                d.setDate_Examen(rs.getString("Date_Examen"));
                d.setsexe(rs.getString("Observations"));
                d.setcodeP(rs.getId("codeP"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }     
                return d;
    }
    //lister des  patients
    public ResultSet liste(){
        ResultSet rs=null;
        //se connecter
        connexion_Base cb=new connexion_Base();
        cb.connect();
        //requete SQL
        String rep="select*from Dossier";
        //executer
        rs=cb.st.executeQuery(rep);
        ResultSet rs = null;
       
      return rs;     
    }

    private static class connexion_Base {

        public connexion_Base() {
        }

        private void connect() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private class st {

            private static void executeUpdate(String rep) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            private static ResultSet executeQuery(String rep) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            public st() {
            }
        }
    }

    private static class Level {

        private static java.util.logging.Level SEVERE;

        public Level() {
        }
    }

    private static class Dossier {

        public Dossier() {
        }

        private void setdateCreation(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setId(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setnature_Examen(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setDate_Examen(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setsexe(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
