/*
 * Author: Kaden Payne
 * Date: 5/20/2020
 * 
 * DnD battle with initiatives
 */
import java.util.Scanner;
/**
 * This program does a simple DnD battle. The user enters how many fighters are 
 * fighting and then they enter, in order of initiative, the attack modifier, 
 * damage die and damage modifier of their weapon, HP and AC of the fighters. 
 * The program then displays that information and then ask for who's attacking 
 * and who's being attacked. After that, the attack is "rolled". If it hits, it 
 * "rolls" damage and show the HP lost after damage. The program ask after each 
 * attack if the user wants to continue. If yes, it loops the attacker and 
 * attacked questions. If no, the program ends.
 * @author kjpay
 * @version 1.0
 */
public class Initiative_Battle {
    /**
     * This method is where the user enters the number of fighters in the battle. 
     * The user then enters in order of initiative the attack modifier, damage die, 
     * and damage modifier, HP and AC of fighters. The method then ask who's fighting 
     * and who's being attacked. The hitOrMiss method is called to see if the 
     * attack hits or misses. After the method ends, the method ask if the user 
     * wants to continue. If yes, the method does the who's attacking and who's 
     * being attacked questions again. If no, the program ends.
     * @param args not used
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Entering Initiative
        System.out.print("How many fighters are in the battle: ");
        int numOfFighters = input.nextInt();
        int[][] orderOfCombat = new int[numOfFighters][5];
        for (int row = 0; row < orderOfCombat.length; row++) {
            System.out.print("Enter attack modifier, damage die, and damage modifier for weapon,\nHP, and AC for fighter " + (row + 1) + ": \n");
            for (int col = 0; col < orderOfCombat[row].length; col++) {
                orderOfCombat[row][col] = input.nextInt();
            }
        }
        //Continue Loop
        boolean contin = true;
        boolean correctAttacker = true;
        boolean correctAttacked = true;
        while (contin == true){
            //Displaying Order of Initiative
            System.out.println("  Order Of Initiative");
            System.out.println("   AM DD DM HP AC");
            for (int row = 0; row < orderOfCombat.length; row++){
                System.out.print((row + 1) + ":");
                for (int col = 0; col < orderOfCombat[row].length; col++) {
                    System.out.print(" " + orderOfCombat[row][col] + " ");
                }
            System.out.println();
            }
            //Who's fighting who
            int attacker = 0;
            int attacked = 0;
            while (correctAttacker == true) {
                System.out.println("Who's attack? Enter 1 through " + numOfFighters + ": ");
                attacker = input.nextInt();
                
                if (attacker > numOfFighters || attacker == 0) {
                    System.out.println("Incorrect input, please re-enter");
                }
                else {
                    correctAttacker = false;
                }
            }
            while (correctAttacked == true) {
                System.out.println("Who's being attacked? Enter 1 through " + numOfFighters + ": ");
                attacked = input.nextInt();
                
                if (attacked > numOfFighters || attacked == 0) {
                    System.out.println("Incorrect input, please re-enter");
                }
                else {
                    correctAttacked = false;
                }
            }
            int att = (orderOfCombat[attacker - 1][0]);
            int ac = (orderOfCombat[attacked - 1][4]);
            int die = (orderOfCombat[attacker - 1][1]);
            int damMod = (orderOfCombat[attacker - 1][2]);
            hitOrMiss(att, ac, die, damMod, orderOfCombat, attacked);
            
            System.out.print("Continue? Yes or No: ");
            String answer = input.next();
            if (answer.equalsIgnoreCase("No")) {
                contin = false;
            }
            correctAttacker = true;
            correctAttacked = true;
        }
    }
    /**
     * This method "rolls" a 20 sided die. If it's a 1, it prints the roll, "Critical Fail!" 
     * and ends method. If it's a 20, it prints the roll, "Critical Hit!", and calls
     * getCritDamage method. If neither, the roll is add by the attack modifier 
     * and is compared to the AC. If it's least then the AC, it prints the roll, 
     * "Miss", and ends the method. If it's greater then the AC, it prints the roll, 
     * "Hit" and calls the getDamage method.
     * @param attack attack modifier of the attacker
     * @param ac AC of the one being attacked
     * @param die damage die of the attacker
     * @param damMod damage modifier of the attacker
     * @param hp orderOfCombat array, used with attacked to get the HP of the one being attacked
     * @param attacked the one being attacked, used with hp to get the HP
     */
    public static void hitOrMiss(int attack, int ac, int die, int damMod, int[][] hp, int attacked) {
        int roll = getRandomNumber(1, 20);
        switch (roll) {
            case 1:
                System.out.println(roll + " Critical Fail!");
                break;
            case 20:
                System.out.println(roll + " Critical Hit!");
                getCritDamage(die, damMod, hp, attacked);
                break;
            default:
                roll += attack;
                 if (roll < ac) {
                    System.out.println(roll + " Miss!");
                }
                else {
                    System.out.println(roll + " Hit!");
                    getDamage(die, damMod, hp, attacked);
                }
        }
    }
    /**
     * This method "rolls" the damage die and adds the damage modifier to the roll.
     * The damage is used to minus the HP of the one being attacked. The method 
     * prints the roll, "damage. HP is", and the HP after damage is done.
     * @param die damage die of the attacker
     * @param damMod damage modifier of the attacker
     * @param hp orderOfFighters array
     * @param attacked the one being attacked, used with hp to get the HP
     */
    public static void getDamage(int die, int damMod, int[][] hp, int attacked) {
        int damage = getRandomNumber(1, die) + damMod;
        hp[attacked - 1][3] -= damage;
        if (hp[attacked - 1][3] < 0) {
            hp[attacked - 1][3] = 0;
        }
        System.out.println(damage + " damage! HP is " + hp[attacked - 1][3] + ".");
    }
    /**
     * This method is the same as the getDamage method but the damage die is times 
     * by 2.
     * @param die damage die of the attacker
     * @param damMod damage modifier of the attacker
     * @param hp orderOfFighters array
     * @param attacked the one being attacked, used with hp to get HP
     */
    public static void getCritDamage(int die, int damMod, int[][] hp, int attacked) {
        int damageDie = die * 2;
        int damage = getRandomNumber(2, damageDie) + damMod;
        hp[attacked - 1][3] -= damage;
        if (hp[attacked - 1][3] < 0) {
            hp[attacked - 1][3] = 0;
        }
        System.out.println(damage + " damage! HP is " + hp[attacked - 1][3] + ".");
    }
    /**
     * This method randomly picks a number between to numbers. 1-20 is the common 
     * numbers picked. 
     * @param num1 the lowest number
     * @param num2 the highest number
     * @return the number picked between num1 and num2
     */
    public static int getRandomNumber(int num1, int num2) {
        return (int)(num1 + Math.random() * (num2 - num1 + 1));
    }
}
