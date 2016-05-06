/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cset;

import edu.webservice.Users;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author mmtadesse2016
 */
public class SignUpController implements Initializable {


  
    @FXML
    private PasswordField password;// used for a password input on the Registration page
    @FXML
    private PasswordField confirmpassword;//used for confirming that user did not mis-type their password
    @FXML
    private TextField username;//for a username input on the Registration page
    @FXML
    private TextField lastname;// for a lastname input on the Registration page
    @FXML
    private TextField firstname;// for a firstname input on the Registration page
   
    /**
     * This method checks if the two provided passwords match. 
     * @return this method returns false if they don't match and true if they match
     */
        private boolean passwordmatch()
    {
        return password.getText().equals(confirmpassword.getText());
    }
    
    /**
     * This method is used to register users on the database
     * @param event invoked by pressing the Save button
     * @throws Exception 
     */
    @FXML
    private void Savereg(ActionEvent event) throws Exception{
        if(this.passwordmatch()){
      
            this.registerUser(username.getText(), firstname.getText(),lastname.getText(), password.getText());
        JOptionPane.showMessageDialog(null, "Registration Successful!");
        
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
           Parent parent = FXMLLoader.load(getClass().getResource("Login.fxml"));
           Stage stage= new Stage();
           Scene scene= new Scene(parent);
           stage.setScene(scene);
           stage.setTitle("Login");
                   stage.getIcons().add(new Image("b2f793455d99a12837be43b2448142d6.jpg"));
           stage.show();
        
        }
    
        else {
                password.setText("");
                confirmpassword.setText("");
             JOptionPane.showMessageDialog(null, "Password does not match with Confirm Password!");
        }
    }
    
    
    
    /**
     * This method is used to cancel registration and navigate back to the login page
     * @param event this event closes the Registation page and navigates the user on to the Login page
     * @throws Exception 
     */
      @FXML
    private void Cancelreg(ActionEvent event) throws Exception{
           ((Node)(event.getSource())).getScene().getWindow().hide();
           Parent parent = FXMLLoader.load(getClass().getResource("Login.fxml"));
           Stage stage= new Stage();
           Scene scene= new Scene(parent);
           stage.setScene(scene);
           stage.setTitle("Login");
                   stage.getIcons().add(new Image("b2f793455d99a12837be43b2448142d6.jpg"));
           stage.show();
    }
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private Users registerUser(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        edu.webservice.UsersFacadeService service = new edu.webservice.UsersFacadeService();
        edu.webservice.UsersFacade port = service.getUsersFacadePort();
        return port.registerUser(arg0, arg1, arg2, arg3);
    }

    
  
}
