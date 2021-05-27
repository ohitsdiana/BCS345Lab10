/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.*;

/**
 *
 * @author 16316
 */
public class Lab10GUIController implements Initializable {
    
    @FXML
    private TextField label_fn;
    @FXML
    private TextField label_ln;
    @FXML
    private RadioButton rb_delivery;
    @FXML
    private ToggleGroup serviceOption;
    @FXML
    private RadioButton rb_pickUp;
    @FXML
    private Button btn_submit;
    @FXML
    private CheckBox ck1;
    @FXML
    private CheckBox ck2;
    @FXML
    private CheckBox ck3;
    @FXML
    private CheckBox ck4;
    @FXML
    private Label outputLabel;
    @FXML
    private ImageView imageView;
    @FXML
    private RadioButton rb_volcano;
    @FXML
    private ToggleGroup imageGroup;
    @FXML
    private RadioButton rb_accident;
    
    private Image image1, image2;

    @FXML
    private void handleSubmitButton(ActionEvent event) {
        String fname = label_fn.getText();
        String lname = label_ln.getText();
        
        String option = " ";
        if(rb_delivery.isSelected())
            option += "Delivered";
        else if(rb_pickUp.isSelected())
            option += "Pick Up";
        
        String order = " ";
        double total = 0;
        
        if(ck1.isSelected()){
            order += "Philly Steak Sandwich\n";
            total += 12.50;
        }
        
        if(ck2.isSelected()){
            order += "Chicken Sandwich\n";
            total += 11.50;
        }
        
        if(ck3.isSelected()){
            order += "Tuna Sandwich\n";
            total += 13.00;
        }
        
        if(ck4.isSelected()){
            order += "Cheese Sandwich\n";
            total += 8.75;
        }
        
        String summary = fname + " " + lname + ",\n\n" + "Here is your order:\n" + order + "\n" + "Amount Due: " + total + "\n" + "Your Order Will Be" + option;
        outputLabel.setText(summary);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        image1 = new Image("lab10gui/volcano.jpg");
        image2 = new Image("lab10gui/accident.jpg");
    }

    @FXML
    private void rb_volcano_Listener(ActionEvent event) {
        imageView.setImage(image1);
    }

    @FXML
    private void rb_accident_Listener(ActionEvent event) {
        imageView.setImage(image2);
    }
}