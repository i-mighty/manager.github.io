/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.java;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

/**
 *
 * @author root
 */
public class BaseController implements Initializable{
    @FXML public Pane hostPane;
    Pane pane;// landing pane for incoming fxml
    void onLoad(){
        try {
            pane = (Pane) FXMLLoader.load(getClass().getResource("/manager/layouts/home.fxml"));
            hostPane.getChildren().add(pane);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } 
    }
    @FXML public void goHome(ActionEvent e){
        
        try {
            pane = (Pane) FXMLLoader.load(getClass().getResource("/manager/layouts/home.fxml"));
            hostPane.getChildren().add(pane);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } 
    }
    @FXML public void showAllUser(ActionEvent e){
        
    }
    @FXML public void showActiveUsers(ActionEvent e){
        
    }
    @FXML public void showStats(ActionEvent e){
        
    }
    @FXML public void myProfile(ActionEvent e){
        
    }
    @FXML public void logOut(ActionEvent e){
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    
}
