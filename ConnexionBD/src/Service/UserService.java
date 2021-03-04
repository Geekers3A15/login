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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 21650
 */
public class UserService implements Iservice<User> {
    
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;

    private Connection conn;

    @Override
    public void AjouterUser() {
    }

    @Override
    public void DeleteUser() {
        
        //To change body of generated methods, choose Tools | Templates.
    }
public UserService() {
        conn = DataSource.getInstance().getCnx();
    }
public void ajouterUser(User u) {
        String req = "insert into User (pseudo,email,type,role) values (?,?,?,?)";

        try {
            pst = conn.prepareStatement(req);
            pst.setString(1, u.getPseudo());
            pst.setString(2, u.getEmail());
             pst.setString(3, u.getType());
              pst.setString(4, u.getRole());
            
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}





   

