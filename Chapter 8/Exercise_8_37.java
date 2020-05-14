/*
 * Author: Kaden Payne
 * Date: 5/13/2020
 * 
 * Guess the capital of ten states
 */

/**
 *
 * @author kjpay
 */
import java.util.Scanner;

public class Exercise_8_37 {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Creating array with states and capitals and counter for correct answers
        String[][] questions = {{"Nevada", "Utah", "Hawaii", "California", "Virginia", "Texas", "New York", "Oregon", "Tennessee", "Rhode Island"},
            {"Carson City", "Salt Lake City", "Honolulu", "Sacramento", "Richmond", "Austin", "Albany", "Salem", "Nashville", "Providence"}};
        int correctCount = 0;
        
        //Prompt to answer questions
        for (int i = 0; i < 10; i++) {
            System.out.println("What is the capital of " + questions[0][i] + "? ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(questions[1][i])) {
                System.out.println("Correct answer!");
                correctCount++;
            }
            else {
                System.out.println("Incorrect. Correct answer is " + questions[1][i]);
            }
        }
        System.out.println("You get " + correctCount + " question right!");
    }    
}
