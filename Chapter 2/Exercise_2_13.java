/*
 * Author: Kaden Payne
 * Date: 4/8/2020
 * 
 * Finding account value after six months
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    // Entering monthly saving
    System.out.print("Enter monthly saving amount: ");
    double monthlysaving = input.nextDouble();
    
    // Monthly interest
    final double MONTHLYINTEREST = (1 + 0.00417);
    
    // Account value after one month
    double accountvalue = monthlysaving * MONTHLYINTEREST;
    
    // Account value after two months
    accountvalue = (monthlysaving + accountvalue) * MONTHLYINTEREST;
    
    // Account value after three to six months
    accountvalue = (monthlysaving + accountvalue) * MONTHLYINTEREST;
    accountvalue = (monthlysaving + accountvalue) * MONTHLYINTEREST;
    accountvalue = (monthlysaving + accountvalue) * MONTHLYINTEREST;
    accountvalue = (monthlysaving + accountvalue) * MONTHLYINTEREST;
    
    // Display account value after six months
    System.out.println("After the sixth month, the account value is " + accountvalue);
    }
}
