/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import connexionbd.DataSource;
import entite.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 21650
 */
public abstract class UserService implements Iservice<User> {
    
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;

    private Connection conn;

  
  public  List<User> read() throws SQLException{
     List<User> ls = new ArrayList<>();
     Statement st=conn.createStatement();
     String req="select*from user";
     while(rs.next()){
         int id_user=rs.getInt("user_id");
         String nom=rs.getString(2);
         String prenom=rs.getString(3);
     
     User u = new User(id_user,nom,prenom);
     ls.add(u);}
     return ls;
     
     
  }
          


    public void DeleteUser(User u) throws SQLException {
        PreparedStatement pt = conn.prepareStatement("delete from personne where id_user= ?");
        pt.setInt(1, u.getId_user());
        pt.executeUpdate();    
    
        //To change body of generated methods, choose Tools | Templates.
    }
public UserService() {
        conn = DataSource.getInstance().getCnx();
    }
public void ajouterUser(User u) {
        String req = "insert into User (pseudo,email,role) values (?,?,?)";

        try {
            pst = conn.prepareStatement(req);
            pst.setString(1, u.getPseudo());
            pst.setString(2, u.getEmail());
             
              pst.setString(3, u.getRole());
            
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
}

   


}





   

