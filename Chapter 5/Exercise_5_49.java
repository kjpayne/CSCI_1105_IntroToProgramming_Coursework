/*
 * Author: Kaden Payne
 * Date: 4/27/2020
 * 
 * Counting vowels and consonants
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_5_49 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Variables
        char vowelA = 'A';
        char vowelE = 'E';
        char vowelI = 'I';
        char vowelO = 'O';
        char vowelU = 'U';
        int vowelCount = 0;
        int consonantCount = 0;
        
        //Prompt to enter
        System.out.print("Enter string: ");
        String s = input.nextLine();
        s = s.toUpperCase();
        
        //Loop
        int low = 0;
        int high = s.length();
        
        while (low < high) {
            if (s.charAt(low) == vowelA || s.charAt(low) == vowelE || s.charAt(low) == vowelI || s.charAt(low) == vowelO || s.charAt(low) == vowelU) {
                vowelCount++;
            }
            else {
                consonantCount++;
            }
        low++;
        }
        
        //Displaying
        System.out.println(s + " has " + vowelCount + " vowels and " + consonantCount + " consonants");
    }    
}
