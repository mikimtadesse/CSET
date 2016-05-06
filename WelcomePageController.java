/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cset;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mmtadesse2016
 */
public class WelcomePageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML Label welcometxt;
    @FXML SplitPane workstation;
    @FXML Label username;
    @FXML Button logout;
    @FXML Button createprogram;
    @FXML Button createcourse;
    @FXML Button createsection;
    
    @FXML
    private void Signoff(ActionEvent event) throws Exception
    {
        ((Node)(event.getSource())).getScene().getWindow().hide();
           Parent parent = FXMLLoader.load(getClass().getResource("Login.fxml"));
           Stage stage= new Stage();
           Scene scene= new Scene(parent);
           stage.setScene(scene);
           stage.setTitle("Login");
                   stage.getIcons().add(new Image("b2f793455d99a12837be43b2448142d6.jpg"));
           stage.show();
        
        
    }
    
    @FXML
    private void CreateProgram(ActionEvent event) throws Exception
    {
        ((Node)(event.getSource())).getScene().getWindow().hide();
           Parent parent = FXMLLoader.load(getClass().getResource("CreateProgram.fxml"));
           Stage stage= new Stage();
           Scene scene= new Scene(parent);
           stage.setScene(scene);
           stage.setTitle("Create Program");
                   stage.getIcons().add(new Image("b2f793455d99a12837be43b2448142d6.jpg"));
           stage.show();
        
        
    }
    
}
