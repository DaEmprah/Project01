package com.example.project01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private TextArea screen1 = new TextArea();
    @FXML
    private TextArea screen2 = new TextArea();
    @FXML
    private MenuButton menu1 = new MenuButton();
    @FXML
    private MenuButton menu2 = new MenuButton();
    @FXML
    private MenuButton menu3 = new MenuButton();
    @FXML
    private Weapon weapon1;
    @FXML
    private Weapon weapon2;
    @FXML
    private Weapon weapon3;
    @FXML
    private Button toFileButton = new Button();
    @FXML
    private void compareButtonOnAction() {
        screen1.setText(Application.weaponCompare(weapon1, weapon2));
    }
    @FXML
    private void handleMenuItemClick(ActionEvent event) {
        if (event.getTarget() instanceof MenuItem) {
            MenuItem clickedItem = (MenuItem) event.getTarget();
            String weaponName1 = clickedItem.getText();
            menu1.setText(weaponName1);
            for(int x = 0; x<Application.weaponList.size(); x++){
                if(Application.weaponList.get(x).getName().equals(weaponName1)){
                    weapon1 = Application.weaponList.get(x);
                }
            }
        }
    }
    @FXML
    private void handleMenuItemClick2(ActionEvent event) {
        if (event.getTarget() instanceof MenuItem) {
            MenuItem clickedItem = (MenuItem) event.getTarget();
            String weaponName2 = clickedItem.getText();
            menu2.setText(weaponName2);
            for(int x = 0; x<Application.weaponList.size(); x++){
                if(Application.weaponList.get(x).getName().equals(weaponName2)){
                    weapon2 = Application.weaponList.get(x);
                }
            }
        }
    }
    @FXML
    private void handleMenuItemClick3(ActionEvent event) {
        if (event.getTarget() instanceof MenuItem) {
            MenuItem clickedItem = (MenuItem) event.getTarget();
            String weaponName3 = clickedItem.getText();
            menu3.setText(weaponName3);
            for(int x = 0; x<Application.weaponList.size(); x++){
                if(Application.weaponList.get(x).getName().equals(weaponName3)){
                    weapon3 = Application.weaponList.get(x);
                    screen2.setText(weapon3.toString());
                }
            }
        }
    }
    @FXML
    private void writeToFileOnAction(){
        Application.writeToFile(weapon3);
    }
}