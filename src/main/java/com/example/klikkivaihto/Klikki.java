package com.example.klikkivaihto;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Klikki extends Application {
    private boolean set = false;
    public void start(Stage stage)  {
        Button nappi1 = new Button("Ohjelmointi on kivaa");
        Font font = Font.font(15);
        nappi1.setFont(font);

        nappi1.setOnMouseClicked(e -> {
            set = ! set;
            if (e.getButton() == MouseButton.PRIMARY) {
                nappi1.setText(set? "Ohjelmointi on kivaa" : "Koska päästään syömään");
            } else if (e.getButton() == MouseButton.SECONDARY) {
                nappi1.setText(set? "Ohjelmointi on kivaa" : "Koska päästään syömään");
            }
        });
        nappi1.setOnKeyPressed(e -> {
            if (e.getEventType() == KeyEvent.KEY_PRESSED) {
                set = ! set;
                nappi1.setText(set? "Ohjelmointi on kivaa" : "Koska päästään syömään");
            }
        });
        Scene scene = new Scene(nappi1, 300, 300);
        stage.setScene(scene);

        stage.setTitle("Hiiriteksti");
        stage.show();
        nappi1.requestFocus();
    }
    public static void main(String[] args) {
        launch();
    }
}