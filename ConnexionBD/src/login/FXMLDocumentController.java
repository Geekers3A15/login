/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Service.UserService;
import connexionbd.DataSource;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author 21650
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private ResourceBundle resources;

    @FXML
   private URL location;

    @FXML
    private Button loginbt;

    @FXML
    private Button signinbt;

    @FXML
    private AnchorPane Loginpane;

    @FXML
    private ComboBox<String> domainbt;

    @FXML
    private TextField pseudotxt;

    @FXML
    private TextField rmdptxt;

    @FXML
    private TextField mdptxt;

    @FXML
    private ComboBox<String> typebt;

    @FXML
    private Button registerbt;

    @FXML
    private TextField emailtxt;

    @FXML
    private AnchorPane Signuppane;
    
     Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
   
    
    
    public void LoginpaneShow(){
    
        Loginpane.setVisible(true);
        Signuppane.setVisible(false);
    }
    
   
    public void SignuppaneShow(){
    
        Loginpane.setVisible(false);
        Signuppane.setVisible(true);
    }
    private void Login (ActionEvent event) throws Exception{  
        conn =  (Connection) DataSource.getInstance();
        
    String sql = "Select * from user where Pseudo = ? and password = ? and type = ? ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, pseudotxt.getText());
            pst.setString(2, mdptxt.getText());
            pst.setString(3, typebt.getValue());
            
            rs = pst.executeQuery();
       } catch (SQLException e) {
           Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, e);
       }}
        public void Signup (ActionEvent event){    
        conn = (Connection) DataSource.getInstance();
        String sql = "insert into users (type,domaine,email,pseudo,mdp ,rmdp) values (?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, typebt. getValue());
            pst.setString(2, domainbt.getValue());
            pst.setString(3, emailtxt.toString());
            pst.setString(4, pseudotxt.getText());
           pst.setString(5, mdptxt.getText());
           pst.setString(6, rmdptxt.getText());
            pst.executeQuery();
            
            
        } catch (SQLException e) {
            
           Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, e);
       }}
    
   
    
     
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        
domainbt.getItems().addAll("photography", "Design", "Editing");
typebt.getItems().addAll("client", "artist");


// TODO
    }    
    
}
