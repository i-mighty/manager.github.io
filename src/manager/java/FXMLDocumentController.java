/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.java;

import java.io.IOException;
import java.net.URL;
//import java.sql.
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author root
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    @FXML private TextField usernameField;
    @FXML private TextField passwordField;
    @FXML private Text actiontarget;
    
    @FXML private void handleSubmitButtonAction(ActionEvent event) {
        String username = usernameField.getText();//Fetch Username
        String password = passwordField.getText();//fetch Password
        //actiontarget.setText(password);
        //
        String dbUrl = "jdbc:mysql://localhost:3306/mydb";
        try {
           Connection conn = DriverManager.getConnection(dbUrl,"root","");
            Statement query = conn.createStatement();
            ResultSet result = query.executeQuery("SELECT * FROM admin WHERE name='"+username+"'");
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String pass = result.getString("pass");
                String email = result.getString("email");
                actiontarget.setText(email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        String url = "/manager/layout/base.fxml";
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        try {
//            flipActivity(stage, url);
//        } catch (IOException ex) {
//            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    private void flipActivity(Stage stage, String url) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource(url));
        //
        Scene scene = new Scene(root, 1280, 800);
//        welcome.setFont(Lemonada_bold);
        stage.setScene(scene);
        stage.show();
    }
    @FXML private void sampleText(ActionEvent e){
        actiontarget.setText("User");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
