/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Model.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class Patient_Actions {
     // AJOUTER Patient
    public void ajouter(Patient p){
        //1.SE CONNECTER A LA BASE
        connexion_Base cb=new connexion_Base();
        cb.connect();
        
        //2.REQUETE SQL
        String rep="insert into Patient (nom,prenom,age sexe,adresse) values('"+p.getnom()+"','"+p.getprenom()+"','"+p.getage()+"','"+p.getsexe()+"''"+p.getadresse()+"'";
        
        //3.EXECUTER LA REQUETE
        cb.st.executeUpdate(rep);
        JOptionPane.showMessageDialog(null,"Enregistrement effectuer avec succes");
    }
    //MODIFIER Patient
    public static void modifier(Patient p){
        //1.SE CONNECTER A LA BASE
        connexion_Base cb=new connexion_Base();
        cb.connect();
        //2.REQUETE SQL
        String rep="update Patient set nom='"+p.getnom()+"',prenom='"+p.prenom()+"',age='"+p.getage()+"',sexe='"+p.getsexe()+"',='"+p.getadresse()+"',nom='"+p.getadresse()+"',where codeP='"+p.getcodeP()+"'";
        //EXECUTER
        cb.st.executeUpdate(rep);
    }
    //SUPPRIMER patient
    
    public void supprimer(int codeP){
        //SE CONNECTER à la base
        connexion_Base cb=new connexion_Base();
        cb.connect();
        String codeP = null;
        //REQUETE
        String rep="'delete from Patient where codeP ='"+codeP+"'";
        //EXECUTER LA REQUETE
        cb.st.executeUpdate(rep);
        JOptionPane.showMessageDialog(null,"Suppression avec succés ");
    }
    
    
    
    //RECHERCHER patient
    //FONCTION 
    public Pätient rechercher (int codeP){
        Pätient p=null;
        try {
            //SE CONNECTER
            connexion_Base cb=new connexion_Base();
            cb.connect();
            //REQUETE
            String rep="Select*from Patient where codeP='"+codeP+"'";
            //EXECUTER
            ResultSet rs=cb.st.executeQuery(rep);
            //verifier si on a trouver
            if(rs.next()){
                p.setId(rs.getInt("id"));
                p.setnom(rs.getString("nom"));
                p.setprenom(rs.getString("prenom"));
                p.setage(rs.getString("age"));
                p.setsexe(rs.getString("sexe"));
                p.setadresse(rs.getString("adresse"));
                p.setcodeP((rs.getint("codeP")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }     
                return p;
    }
    //lister des  patients
    public ResultSet liste(){
        //se connecter
        connexion_Base cb=new connexion_Base();
        cb.connect();
        //requete SQL
        String rep="select*from Patient";
        //executer
        cb.st.executeQuery(rep);
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

            private static void executeQuery(String rep) {
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

    private static class Pätient {

        public Pätient() {
        }

        private void setId(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setnom(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setprenom(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setage(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setsexe(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setadresse(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
    
}
