/*
 * Author: Kaden Payne
 * Date: 5/8/2020
 * 
 * Eliminating duplicates in an array by making a new array
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author kjpay
 */
public class Exercise_7_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Making the array
         int[] numList = new int[10];
        System.out.print("Enter 10 numbers seperated with a space: ");
        for (int i = 0; i < numList.length; i++) {
            numList[i] = input.nextInt();
        }
        
        int[] noDups = eliminateDuplicates(numList);
        
        //Displaying new array
        System.out.println("There are " + noDups.length + " distinct number: ");
        for (int i = 0; i < noDups.length; i++) {
            System.out.print(noDups[i] + " ");
        }
    }
    
    public static int[] eliminateDuplicates(int[] list) {
        boolean isUnique = true;
        int[] noDupsList = new int[list.length];
        int index = 0;
        
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    isUnique = false;
                }
            }
            if (isUnique){
                noDupsList[index] = list[i];
                index++;
            }
            
            isUnique = true;
        }
        
        int[] noDups = new int [index];
        for (int i = 0; i < noDups.length; i++) {
            noDups[i] = noDupsList[i];
        }
        return noDups;
    }
}
