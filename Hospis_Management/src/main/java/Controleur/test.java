/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

/**
 *
 * @author luisa
 */
public class test {
      public static void main(String[]args){
        connexion_Base  cb=new connexion_Base();
            cb.connect();
           
         Patient p=new Patient("Ba","seni²","12ans","masculin","medina");
        
         Patient_Actions pa=new Patient_Actions();
         pa.ajouter(p);
        }
      {
        connexion_Base  cb=new connexion_Base();
            cb.connect();
           
         Dossier d=new Dossier("02/03/2023","analyse medicale²","12/03/2023","inapte",143);
        
         Dossier_Actions pa=new Dossier_Actions();
         da.ajouter(d);
        }
    
    
}
