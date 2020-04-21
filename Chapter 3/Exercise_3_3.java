/*
 * Author: Kadden Payne
 * Date: 4/21/2020
 * 
 * Solving for x and y again with input
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_3_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Stating the problem
        System.out.println("Solve x using x = ed - bf / ad - bc and y using y = af - ec / ad - bc");
        
        //Entering a, b, c, d, e, and f
        System.out.print("Enter a: ");
        double numberA = input.nextDouble();
        System.out.print("Enter b: ");
        double numberB = input.nextDouble();
        System.out.print("Enter c: ");
        double numberC = input.nextDouble();
        System.out.print("Enter d: ");
        double numberD = input.nextDouble();
        System.out.print("Enter e: ");
        double numberE = input.nextDouble();
        System.out.print("Enter f: ");
        double numberF = input.nextDouble();
        
        //Solving for x and y
        if (((numberA * numberD) - (numberB * numberC)) != 0){
            System.out.println("x = " + ((numberE * numberD) - (numberB * numberF)) / ((numberA * numberD) - (numberB * numberC)));
            System.out.println("y = " + ((numberA * numberF) - (numberE * numberC)) / ((numberA * numberD) - (numberB * numberC)));
        }
        else {
            System.out.println("The equation has no solution");
        }
    }
}
