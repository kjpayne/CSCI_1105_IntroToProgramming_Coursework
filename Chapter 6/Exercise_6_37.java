/*
 * Author: Kaden Payne
 * Date: 4/30/2020
 * 
 * Making a number the width of x
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_6_37 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Enter number and width
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.print("Enter width: ");
        int widthOf = input.nextInt();
        
        System.out.println(num + " with the width of " + widthOf + " looks like " + format(num, widthOf));
    }
    public static String format(int number, int width) {
        String zero = "0";
        String sNum = number + "";
        while (sNum.length() < width) {
            sNum = zero + sNum;
        }
        return sNum;
    }
}
