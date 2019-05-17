package gui.fx;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 401-06 on 4/18/2019.
 */
public class XOGame {
    static int[][] board=new int[3][3];
    static int player = 1;
    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        while(!winner() && !boardIsFull()){
            Runtime.getRuntime().exec("cmd /c cls");
            showBoard();
            selectAndSet();
            changePlayer();


        }
        if(boardIsFull()){
            System.out.println("No Winner:)");
        }else{
            showBoard();
            changePlayer();
            System.out.println("We have a winner");
            System.out.println("plater "+player+" Won");
        }

    }

    public static void changePlayer() {
        //1->2
        //2->1

        player = player%2+1;

    }

    public static void selectAndSet() {
        System.out.println("X:");
        int p = keyboard.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i*3+j+1==p) {
                    board[i][j] = player;
                }
            }
        }

    }

    public static void showBoard() {
        for (int i = 0; i < 3 ; i++) {
            System.out.println("-------");
            String line="|";
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]){
                    case 0:
                        line+=" |";
                        break;
                    case 1:
                        line+="X|";
                        break;
                    case 2:
                        line+="O|";
                        break;
                }
            }
            System.out.println(line);
        }
        System.out.println("-------");
    }

    public static boolean boardIsFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]==0) return false;
            }
        }
        return true;
    }

    public static boolean winner() {
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
}
