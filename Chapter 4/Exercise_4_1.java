/*
 * Author: Kaden Payne
 * Date: 4/22/2020
 * 
 * Solving the area of a pentagon
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_4_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Stating the problem
        System.out.println("Sovling the area of a pentagon");
        
        //Entering the radius of the pentagon
        System.out.print("Enter the length from the center to the vertex: ");
        double r = input.nextDouble();
        
        //Solving for the side
        double s = ((2 * r) * Math.sin(Math.PI / 5));
        System.out.println("The side is " + s);
        
        //Solving the area
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.println("The area of the pentagon is " + area);
    }
    
}
