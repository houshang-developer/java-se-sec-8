package gui.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Created by 401-06 on 5/16/2019.
 */
public class App4 extends Application {
    int randomNumber = (int)(20*Math.random());
    int counter = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(); //layout
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(5);
        Scene scene = new Scene(pane, 200,300);
        Label info = new Label();
        TextField number = new TextField();
        number.setPromptText("please enter your guess");
        Button button = new Button("guess");
        Button button2 = new Button("play again");
        primaryStage.setScene(scene);

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                randomNumber = (int)(20*Math.random());
                counter = 0;
                button2.setVisible(false);
                button.setDisable(false);
            }
        });

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                counter++;
                int guess = Integer.parseInt(number.getText());
                if(guess == randomNumber) {
                    info.setText("you won");
                }else if (guess < randomNumber) {
                    info.setText("guess more!");
                }else {
                    info.setText("guess less!");
                }
                if (counter == 3) {
                    button.setDisable(true);
                    button2.setVisible(true);
                }
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
        button2.setVisible(false);
        pane.getChildren().addAll( info , number , button,button2);
        String path = ClassLoader.getSystemResource("style.css").toString();
        scene.getStylesheets().add(path);
        pane.setId("pane");

        primaryStage.show();
    }
}
