package gui.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Created by 401-06 on 5/16/2019.
 */
public class App3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(); //layout
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(5);
        Scene scene = new Scene(pane, 200,300);
        TextField username = new TextField();
        username.setPromptText("please enter your username");
        PasswordField password = new PasswordField();
        password.setPromptText("please enter your password");
        Button button = new Button("Login");
        pane.getChildren().addAll( username , password , button);
        primaryStage.setScene(scene);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(username.getText());
                System.out.println(password.getText());
            }
        });
        button.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("entered");
            }
        });
        button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("exit");
            }
        });
        pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getClickCount()>10){
                    JOptionPane.showMessageDialog(null , "be calm!");
                    //System.out.println("be calm!");
                }
            }
        });

        String path = ClassLoader.getSystemResource("style.css").toString();
        scene.getStylesheets().add(path);
        pane.setId("pane");

        primaryStage.show();
    }
}
