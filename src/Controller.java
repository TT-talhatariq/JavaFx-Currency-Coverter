package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Label lbltxt;
    public ComboBox combo;
    public TextField pakmoney;
    public Button btn;
    private int ruppe;
    ObservableList<String> lis = FXCollections.observableArrayList("US","Suadi Arabia", "India");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    combo.setItems(lis);
    }
    public void input(ActionEvent event){
       ruppe = Integer.parseInt(pakmoney.getText());
        if(combo.getValue().equals("US")){
         lbltxt.setText("In US: " + String.valueOf(ruppe*165));
        }
        else if(combo.getValue().equals("India")){
           lbltxt.setText("In India: " + String.valueOf(ruppe*2));
        }
        else{
            lbltxt.setText("In Suadi-e-Arabia: " + String.valueOf(ruppe*30));
        }
    }
}
