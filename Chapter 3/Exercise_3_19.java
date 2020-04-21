/*
 * Author:Kaden Payne
 * Date: 4/21/2020
 * 
 * Solving the perimeter of a triangle
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_3_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Stating problem
        System.out.println("Finding the perimeter of a triangle");
        
        //Entering the sides of the triangle
        System.out.print("Enter side a: ");
        double sideA = input.nextDouble();
        System.out.print("Enter side b: ");
        double sideB = input.nextDouble();
        System.out.print("Enter side c: ");
        double sideC = input.nextDouble();
        
        //Finding the perimeter
        if (sideA + sideB > sideC) {
            if (sideA + sideC > sideB) {
                if (sideB + sideC > sideA) {
                    System.out.println("The perimeter is " + (sideA + sideB + sideC));
                }
            }
        }
        else {
            System.out.println("Input is not valid");
        }
    }
}
