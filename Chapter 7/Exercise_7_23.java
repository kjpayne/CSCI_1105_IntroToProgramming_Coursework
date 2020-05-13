/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjpay
 */
public class Exercise_7_23 {
    public static void main(String[] args){
        
        //Array for lockers
        boolean[] lockers = new boolean[100];
        
        //Opening and closing lockers
        for (int i = 1; i <= lockers.length; i++) {
            for (int j = i; j <= lockers.length; j += i) {
                if (lockers[j - 1] == false) {
                    lockers[j - 1] = true;
                }
                else {
                    lockers[j - 1] = false;
                }
            }
        }
        
        //Displaying open lockers
        System.out.println("The open lockers are: ");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i] == true) {
                System.out.print((i + 1)+ " ");
            }
        }
    }
}
