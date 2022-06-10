package com.example.lab3;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.round;

public class HelloController {
    public TextField rRoller;
    public TextField hRoller;
    public TextField sheetThickness;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
int clickCounter =0;
    double r,h,s,volume,mass,
            galvanizedPrice,steelprice;
    public Button btnMain;
    public void onBtnAction(ActionEvent actionEvent) {
        btnMain.setPrefWidth(1500);
        r=Integer.parseInt(rRoller.getText());
        s=Integer.parseInt(sheetThickness.getText());
        h=Integer.parseInt(hRoller.getText());
        volume=(3.14*r*r*h-(3.14*(r-s)*(r-s)*h))/1000000000;//objętość w metrach sześciennych
        galvanizedPrice=round(10.6*mass*100);
        steelprice=round(7.7*mass*100);

mass = 7900*volume;
    btnMain.setText("cena stali ocynkowanej z podanej warości wynosi: "+ (galvanizedPrice)/100 + "zł, cena stali nieocynkowanej to:" + (steelprice)/100);

    }

    public void clickCounter(ActionEvent actionEvent) {

//        getTxtLicznik.setText("Ilość kliknięć to: " + ++clickCounter);

    }

    public void rValue(ActionEvent actionEvent) {
//        r=Integer.parseInt(rRoller.getText());
    }

    public void hValue(ActionEvent actionEvent) {
//        h=Integer.parseInt(hRoller.getText());
    }

    public void sValue(ActionEvent actionEvent) {
//        s=Integer.parseInt(sheetThickness.getText());
    }
}