/*
 * Author: Kaden Payne
 * Date: 5/13/2020
 * 
 * Making a tic - tac - toe game
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_8_9 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Array for tic - tac - toe
        String[][] game = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        int count = 9;
        boolean spaceX = true;
        boolean spaceO = true;
        int spaceCount = 0;
        
        for (int i = 0; i < count; i++) {
            for (int row = 0; row < game.length; row++) {
                for (int col = 0; col < game[row].length; col++) {
                    System.out.print("| " + game[row][col] + " ");
                }
            System.out.println("|");
            }
            while (spaceX == true) {
                System.out.print("Enter a row (0, 1, or 2) player X: ");
                int rowX = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) player X: ");
                int colX = input.nextInt();
            
                if (!game[rowX][colX].equals("X") && !game[rowX][colX].equals("O")) {
                    game[rowX][colX] = "X";
                    spaceX = false;
                    spaceCount++;
                }
                else {
                    System.out.println("Space is already filled. Please re-enter an empty space.");
                }
            }
            for (int row = 0; row < game.length; row++) {
                for (int col = 0; col < game[row].length; col++) {
                    System.out.print("| " + game[row][col] + " ");
                }
            System.out.println("|");
            }
            if (spaceCount == 9) {
                break;
            }
            while (spaceO == true) {
                System.out.print("Enter a row (0, 1, or 2) player O: ");
                int rowO = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) player O: ");
                int colO = input.nextInt();
            
                if (!game[rowO][colO].equals("X") && !game[rowO][colO].equals("O")) {
                    game[rowO][colO] = "O";
                    spaceO = false;
                    spaceCount++;
                }
                else {
                    System.out.println("Space is already filled. Please re-enter an empty space.");
                }
            }
            spaceX = true;
            spaceO = true;
        }
    }    
}
