/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entite.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 21650
 * @param <T>
 */
public interface Iservice <T> {
 
   void AjouterUser(User u) throws SQLException;
   List<T> read() throws SQLException;

   void DeleteUser(User u) throws SQLException;
   
}
  
    

