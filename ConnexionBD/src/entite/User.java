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
public class User {

    /**
     *
     */
    public int id_user ;
    private String pseudo ;
    private String email;
    String nom;
   String prenom;
   
   
  private String role;
  
   public  User (){
    
}
   public User (int id_user){
     this.id_user=id_user;
   }
   public User(int id_user , String pseudo , String email , String role){
       this.id_user=id_user;
       this.pseudo=pseudo;
       this.email=email;
       this.role=role;
   }
       public User(int id_user , String nom , String prenom){
           this.id_user=id_user;
           this.nom=nom;
           this.prenom=prenom;
           
       }
     
   
   

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }


    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo the pseudo to set
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    

    /**
     * @return the domain
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the domain to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id_user + ",nom= "+nom+ ",prenom ="+prenom+ ", pseudo=" + pseudo + ", email=" + email +  ", role=" + role+ '}';
    }
   
}
