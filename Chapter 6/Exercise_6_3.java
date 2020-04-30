/*
 * Author: Kaden Payne
 * Date: 4/29/2020
 * 
 * Reversing a number and checking if it's a palindrome
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_6_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Stating the problem
        System.out.println("Reversing a number and checking if it's a palindrome");
        
        //Entering number
        System.out.print("Enter number: ");
        int num = input.nextInt();
        
        //Displaying number, reverse, and if it's a palindrome
        System.out.println("You entered: " + num + "\nIt's reverse is: " + reverse(num) + "\nIs it a palindrome?: " + isPalindrome(num));
    }
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number%10;
            number = number / 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
