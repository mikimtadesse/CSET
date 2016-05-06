/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cset;


import edu.webservice.Users;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author mmtadesse2016
 */
public class LoginController implements Initializable {
    
  
   @FXML private PasswordField passwordtxt;//The password field where a userpassword is entered on the login page
   @FXML private Label message;//This is a label that is used to display authenthication errors
   @FXML private TextField usernametxt;//The text field where the username is entered on the login page
   @FXML private String u;
   
   /**
    * This method authenthicates when provided with a username and password
    * @param Keyevent takes an enter key input to authenthicate the user
    * @throws Exception 
    */
  private void login(KeyEvent Keyevent)throws Exception
   {
        message.setText("");
       if(this.authenthicate(usernametxt.getText(), passwordtxt.getText()))
       {        
           usernametxt.setText("");
           passwordtxt.setText("");
           ((Node)(Keyevent.getSource())).getScene().getWindow().hide();
           Parent parent = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
           Stage stage= new Stage();
           Scene scene= new Scene(parent);
           stage.setScene(scene);
           stage.setTitle("Welcome to Cset ");
                   stage.getIcons().add(new Image("b2f793455d99a12837be43b2448142d6.jpg"));

           stage.show();
       }
       else{
           message.setText("Username/Password incorrect\n"+"           Please try again!");
           usernametxt.setText("");
           passwordtxt.setText("");
           
       }
    
   }
   /**
    * This method authenthicates when provided with a username and password
    * @param event this is a mouseclick event or a touch event input
    * @throws Exception 
    */
   private void login(ActionEvent event)throws Exception
   {
        message.setText("");
       if(this.authenthicate(usernametxt.getText(), passwordtxt.getText()))
       {        
           usernametxt.setText("");
           passwordtxt.setText("");
           ((Node)(event.getSource())).getScene().getWindow().hide();
           Parent parent = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
           Stage stage= new Stage();
           Scene scene= new Scene(parent);
           stage.setScene(scene);
           stage.setTitle("Welcome to Cset ");
                   stage.getIcons().add(new Image("b2f793455d99a12837be43b2448142d6.jpg"));

           stage.show();
       }
       else{
           message.setText("Username/Password incorrect\n"+"           Please try again!");
           usernametxt.setText("");
           passwordtxt.setText("");
           
       }
    
   }
   
   /**
    * This method is invoked when the login button is invoked either by touch or a mouse event
    * @param event
    * @throws Exception 
    */
   @FXML
   private void Signin(ActionEvent event)throws Exception {
      
       this.login(event);
    }
   /**
    * This method is invoked when the login button is invoked by pressing enter either on the username textfield or the passwordfield
    * @param keyEvent
    * @throws Exception 
    */
   @FXML
   private void OnEnterKey(KeyEvent keyEvent)throws Exception
   {
       if(keyEvent.getCode()== KeyCode.ENTER)
       {
           this.login(keyEvent);
       }
   }
   
 
   /**
    * This method navigates the user on to the sign up page
    * @param event Invoking the sign up button fires this method
    * @throws Exception 
    */
   
   @FXML
   private void SignUp(ActionEvent event) throws Exception{
       
           usernametxt.setText("");
           passwordtxt.setText("");
           ((Node)(event.getSource())).getScene().getWindow().hide();
           Parent parent = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
           Stage stage= new Stage();
           Scene scene= new Scene(parent);
           stage.setScene(scene);
           stage.setTitle("Registration");
                   stage.getIcons().add(new Image("b2f793455d99a12837be43b2448142d6.jpg"));

           stage.show();
       
   }
   
   
   
   
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       
    }   

    private  boolean authenthicate(java.lang.String arg0, java.lang.String arg1) {
        edu.webservice.UsersFacadeService service = new edu.webservice.UsersFacadeService();
        edu.webservice.UsersFacade port = service.getUsersFacadePort();
        return port.authenthicate(arg0, arg1);
    }

    private Users find(java.lang.Object arg0) {
        edu.webservice.UsersFacadeService service = new edu.webservice.UsersFacadeService();
        edu.webservice.UsersFacade port = service.getUsersFacadePort();
        return port.find(arg0);
    }

 
    
}
