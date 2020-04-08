/*
* Author: Kaden Payne
* Date: 4/8/2020
*
* Converting Celsius to Fahrenheit
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    // Entering a Celsius degree
    System.out.print("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();
    
    // Converting Celsius into Fahrenheit
    double fahrenheit = (9.0 / 5) * celsius + 32 ;
    
    // Display convertion
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
