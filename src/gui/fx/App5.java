package gui.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Created by 401-06 on 5/16/2019.
 */
public class App5 extends Application {
    int[][] board=new int[3][3];
    int player = 1;
    int i;
    int j;
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane(); //layout
        pane.setVgap(5);
        pane.setHgap(5);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 200,200);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                Button button = new Button();
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        board[GridPane.getRowIndex(button)][GridPane.getColumnIndex(button)] = player;
                        if(player==1){
                            button.setText("X");
                        }else {
                            button.setText("O");
                        }
                        changePlayer();
                        if (winner()){
                            JOptionPane.showMessageDialog(null , "You Won!");
                        }
                        else if(boardIsFull()){
                            JOptionPane.showMessageDialog(null , "No Winner:)");
                        }
                    }
                });
                pane.add(button , j , i);
            }
        }
        primaryStage.setScene(scene);
        String path = ClassLoader.getSystemResource("style.css").toString();
        scene.getStylesheets().add(path);
        pane.setId("pane");

        primaryStage.show();
    }
    public boolean winner() {
        for (int i = 0; i < 3; i++) {
            int m = 1;
            int m2 = 1;
            for (int j = 0; j < 3; j++) {
                m = m*board[i][j];
                m2 = m2*board[j][i];
            }
            if (m==1 || m==8) return true;
            if(m2==1 || m2==8) return true;

        }

        int m3 = 1;
        for (int i = 0; i < 3; i++) {
            m3 = m3*board[i][i];
        }
        if(m3==1 || m3==8) return true;

        int m4 = 1;
        m4 = board[0][2]*board[1][1]*board[2][0];
        //TODO write a for for this section
        if (m4==1 || m4 ==8) return true;

        //TODO merge all fors

        return false;


    }
    public boolean boardIsFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]==0) return false;
            }
        }
        return true;
    }
    public void changePlayer() {
        //1->2
        //2->1

        player = player%2+1;

    }
}
