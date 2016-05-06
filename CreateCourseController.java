/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cset;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author mmtadesse2016
 */
public class CreateCourseController implements Initializable {

    
   
        private List<CheckBox> armedList= new ArrayList<>(); 
        @FXML private CheckBox box1;
        @FXML private CheckBox box2;
        @FXML  private CheckBox box3;
        @FXML  private CheckBox box4;
        @FXML  private CheckBox box5;
        @FXML  private CheckBox box6;
        @FXML  private CheckBox box7;
        @FXML  private CheckBox box8;
  


    public CreateCourseController() {
        
    }
   
    @FXML
    public void armBox(ActionEvent e)
    {
       CheckBox box=(CheckBox)e.getSource();
       if(box.isSelected())
       {
           this.armedList.add(box);
            System.out.println( box.getId()+" is armed" );
       }
       else 
       {
           
           this.armedList.remove(box);
            System.out.println( box.getId()+" is cleared" );
       }
               
//      this.tlist[i].setText("Miki!");
//        i++;
        
    }
    
    @FXML
    public void Selected()
    {  
          
        
       
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
