/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjpay
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_8_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Creating ArrayA
        double[][] arrayA = new double[3][3];
        System.out.print("Enter " + arrayA.length + " rows and " + arrayA[0].length + " columns for first array: ");
        for (int row = 0; row < arrayA.length; row++) {
            for (int col = 0; col < arrayA[row].length; col++) {
                arrayA[row][col] = input.nextDouble();
            }
        }
        
        //Creating ArrayB
        double[][] arrayB = new double[3][3];
        System.out.print("Enter " + arrayB.length + " rows and " + arrayB[0].length + "columns for second array: ");
        for (int row = 0; row < arrayB.length; row++) {
            for (int col = 0; col < arrayB[row].length; col++) {
                arrayB[row][col] = input.nextDouble();
            }
        }
        
        //Display
        System.out.println("The sum of ");
        for (int row = 0; row < arrayA.length; row++) {
            for (int col = 0; col < arrayA[row].length; col++) {
                System.out.print(arrayA[row][col] + " ");
            }
        System.out.println();
        }
        System.out.println(" and ");
        for (int row = 0; row < arrayB.length; row++) {
            for (int col = 0; col < arrayB[row].length; col++) {
                System.out.print(arrayB[row][col] + " ");
            }
        System.out.println();
        }
        System.out.println(" is ");
        for (int row = 0; row < addMatrix(arrayA, arrayB).length; row++) {
            for (int col = 0; col < addMatrix(arrayA, arrayB)[row].length; col++) {
                System.out.print(addMatrix(arrayA, arrayB)[row][col] + " ");
            }
        System.out.println();
        }
    }
    public static double[][] addMatrix(double[][] a, double[][] b) {
        //Creating ArrayC
        double[][] arrayC = new double[3][3];
        for (int row = 0; row < arrayC.length; row++) {
            for (int col = 0; col < arrayC[row].length; col++) {
                arrayC[row][col] = a[row][col] + b[row][col];
            }
        }
        return arrayC;
    }
}
