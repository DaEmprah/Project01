package com.example.project01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField screen1;
    @FXML
    private Button compareButton;
//    @FXML
//    private void compareButtonOnAction() {
//        screen1.setText(Application.weaponCompare(Application.weaponList.get(0), Application.weaponList.get(1)));
//    }
    @FXML
    private void handleMenuItemClick(ActionEvent event) {
        if (event.getTarget() instanceof MenuItem) {
            MenuItem clickedItem = (MenuItem) event.getTarget();
            String weaponName = clickedItem.getText();
        }
    }
/*TODO comparison of name and names on list*/
}