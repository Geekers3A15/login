/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author 21650
 */
public class Artiste extends User {
  
    
   private String Domaine;
     
    public Artiste(){
        
    }
        public Artiste(int id_user, String nom,String prenom, String Domaine){
           super();
           
            this.Domaine=Domaine;
        }    

    

  

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String Domaine) {
        this.Domaine = Domaine;
    }

    @Override
    public String toString() {
        return "Artiste{" + "id=" + id_user + ", nom=" + nom + ", prenom=" + prenom + ", Domaine=" + Domaine + '}';
    }
    
    
    
}
