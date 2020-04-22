/*
 * Author: Kaden Payne
 * Date: 4/22/2020
 * 
 * Finding payroll
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_4_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Enter data
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: $");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();
        
        //Display data
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);
        double grossPay = payRate * hoursWorked;
        System.out.printf("Gross Pay: $%2.2f\n", grossPay);
        System.out.println("Deductions:");
        double federalRatePercent = ((federalRate * 100));
        double federalDeduction = grossPay * federalRate;
        System.out.printf("\tFederal Withholding (%2.1f%%): $%2.2f\n", federalRatePercent, federalDeduction);
        double stateRatePercent = ((stateRate * 100));
        double stateDeduction = grossPay * stateRate;
        System.out.printf("\tState Withholding (%2.1f%%): $%2.2f\n", stateRatePercent, stateDeduction);
        double totalDeduction = federalDeduction + stateDeduction;
        System.out.printf("\tTotal Deducton: $%2.2f\n", totalDeduction);
        double netPay = grossPay - totalDeduction;
        System.out.printf("Net Pay: $%2.2f\n", netPay);
    }
    
}
