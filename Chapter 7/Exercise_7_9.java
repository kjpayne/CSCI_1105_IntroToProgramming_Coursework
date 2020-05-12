/*
 * Author: Kaden Payne
 * Date: 5/8/2020
 * 
 * Method for findning the smallest number in an array that the user enters
 */
import java.util.Scanner;
/**
 * This program finds the smallest number in an array that the user enters
 * @author kjpay
 * @version 1.0
 */


public class Exercise_7_9 {
    /**
     * This method takes the input of the user to make an array and then calls
     * the method min to find the smallest number in the array
     * @param args not used
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Entering 10 numbers into the array
        double[] numList = new double[10];
        System.out.print("Enter 10 numbers seperated with a space: ");
        for (int i = 0; i < numList.length; i++) {
            numList[i] = input.nextDouble();
        }
        
        //Displaying min number of array
        System.out.println("The minimum number is " + min(numList));
    }
    /**
     * This method finds the smallest number in the array made in the 
     * above method and returns back to the above method
     * @param array the array made above by the user
     * @return the smallest number in the array
     */
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
