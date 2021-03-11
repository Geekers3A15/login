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
public class Client extends User {
   
    private String nom;
    private String prenom;
    
    
    public Client (){
        
    }
    public Client(int id_user , String nom , String prenom){
      super();
      
        this.nom=nom;
        this.prenom=prenom;
        
    }

    /**
     * @return the id
     */
 
    

 
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id_user + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
}
