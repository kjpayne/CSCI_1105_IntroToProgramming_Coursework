/*
 * Author: Kaden Payne
 * Date: 4/27/2020
 * 
 * Counting from 100 to 200
 */

/**
 *
 * @author kjpay
 */
public class Exercise_5_11 {
    public static void main(String[] args){
        
        //Making the varibles
        int number = 100;
        final int NUMBER_OF_INPUTS_PER_LINE = 10;
        int count = 0;
        
        //Stating program
        System.out.println("Counting from 100 to 200 that are divisible by 5 or 6, but not both");
        
        //Making the loop
        while (number <= 200) {
            
            //Loop for displaying
            while (number % 5 == 0 ^ number % 6 ==0) {
                count++;
                if (count % NUMBER_OF_INPUTS_PER_LINE == 0) {
                    System.out.println(number);
                }
                else {
                    System.out.print(number + " ");
                    break;
                }
            }
        number++;
        }
    }
}
