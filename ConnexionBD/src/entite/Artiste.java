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
public class Artiste {
    public int id ;
    public String nom;
    public String prenom;
    public String Domaine;
     
    public Artiste(){
        
    }
        public Artiste(int id , String nom,String prenom, String Domaine){
            this.id=id;
            this.nom=nom;
            this.prenom=prenom;
            this.Domaine=Domaine;
        }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String Domaine) {
        this.Domaine = Domaine;
    }

    @Override
    public String toString() {
        return "Artiste{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", Domaine=" + Domaine + '}';
    }
    
    
}
