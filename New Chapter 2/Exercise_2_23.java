/*
 * Author: Kaden Payne
 * Date: 4/8/2020
 * 
 * Cost of driving
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        // Entering driving distance
        System.out.print("Enter the driving distance: ");
        double drivingdistance = input.nextDouble();
        
        // Entering miles per gallon
        System.out.print("Enter miles per gallon: ");
        double milespergallon = input.nextDouble();
        
        // Entering price per gallon
        System.out.print("Enter price per gallon: ");
        double pricepergallon = input.nextDouble();
        
        // Finding the cost of driving
        double costofdriving = drivingdistance / milespergallon * pricepergallon;
        costofdriving = (int) (costofdriving * 100) / 100.0;
        
        // Displaying cost of driving
        System.out.println("The cost of driving is " + costofdriving);
    }
}
