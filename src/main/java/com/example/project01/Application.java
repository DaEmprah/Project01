package com.example.project01;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hunt weapon comparison tool!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    Weapon BombLance = new Weapon("Bomb Lance", 199, 3, "special ammo", 150, 15, "1/5 bolts", 4, 25, 87, 60, 180, 360);
}
/*String name, int cost, int size, String ammoType,
 int damage, int rateOfFire, String weaponCapacity,
 int reloadSpeed, int effectiveRange, int handling,
 int muzzleVelocity, int meleeDamage, int heavyDamage*/