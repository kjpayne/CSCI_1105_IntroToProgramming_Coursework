/*
 * Author: Kaden Payne
 * Date: 4/29/2020
 * 
 * Making a n by n matrix
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_6_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Enter number
        System.out.print("Enter number: ");
        int num = input.nextInt();
        
        //Display n by n matrix
        printMatrix(num);
    }    
    //Method for n by n matrix
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(getRandomCharacter('0', '1'));
            }
        System.out.println();
        }
    }
    //Method for randomly picking 0 or 1
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}
