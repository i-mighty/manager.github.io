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
import java.time.Duration;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
//    @FXML public Pane hostPane;

    @FXML private void handleSubmitButtonAction(ActionEvent event) {
        String username = usernameField.getText();//Fetch Username
        String password = passwordField.getText();//fetch Password
        //actiontarget.setText(password);
        //
//        String dbUrl = "jdbc:mysql://localhost:3306/mydb";
//        try {
//           Connection conn = DriverManager.getConnection(dbUrl,"root","");
//            Statement query = conn.createStatement();
//            ResultSet result = query.executeQuery("SELECT * FROM admin WHERE name='"+username+"'");
//            while(result.next()){
//                int id = result.getInt("id");
//                String name = result.getString("name");
//                String pass = result.getString("pass");
//                String email = result.getString("email");
//                actiontarget.setText(email);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        String url = "/manager/layouts/base.fxml";
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            flipActivity(stage, url);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML public Pane hostPane;
    private void flipActivity(Stage stage, String url) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
        Parent root = loader.load();
        //
        Scene scene = new Scene(root, 1280, 720);
        stage.setScene(scene);
        BaseController controller = loader.<BaseController>getController();
        controller.onLoad();
        stage.show();
        Pane pane;
    }
    @FXML private void sampleText(ActionEvent e){
        actiontarget.setText("User");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {            
//        Calendar cal = Calendar.getInstance();
//        second = cal.get(Calendar.SECOND);
//        minute = cal.get(Calendar.MINUTE);
//        hour = cal.get(Calendar.HOUR);
//        //System.out.println(hour + ":" + (minute) + ":" + second);
//        time.setText(hour + ":" + (minute) + ":" + second);// FXML node
//    }),
//         new KeyFrame(Duration.seconds(1))
//    );
//    clock.setCycleCount(Animation.INDEFINITE);
//    clock.play();
    }    
    
}
