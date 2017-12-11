/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.java;

import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author root
 */

public class Manager extends Application {
    @FXML TextField oldie;
    @FXML Text welcome;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/manager/layout/base.fxml"));
        Font Lemonada = Font.loadFont(Manager.class.getResource("/manager/resources/fonts/Lemonada.ttf").toExternalForm(), 10);
        Font Font_Awesome = Font.loadFont(Manager.class.getResource("/manager/resources/fonts/fontawesome-webfont.ttf").toExternalForm(), 10);
        Font Heartbit =  Font.loadFont(Manager.class.getResource("/manager/resources/fonts/Heartbit-Bold.otf").toExternalForm(), 10);
        Font uzunduraz =  Font.loadFont(Manager.class.getResource("/manager/resources/fonts/uzunduraz_dirty.otf").toExternalForm(), 10);
        Font Bellefair = Font.loadFont(Manager.class.getResource("/manager/resources/fonts/Bellefair-Regular.ttf").toExternalForm(), 10);
        Scene scene = new Scene(root, 1280, 720);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
