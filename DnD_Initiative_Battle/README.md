# DnD Initiative Battle

## Synopsis
This program is for making DnD battles faster and easier. You place fighters in order of initiative with their attack modifiers, 
damage dies and modifiers, HP and AC. The program does rolls for attacks and damage while telling you the roll and HP of the fighters.

## Motivation
I was motivated to build this program to keep battles fun without pauses of a dicussion of the rolls. The more you stay in the illution
of battle, the better the experience.

## How To Run
[The beginning is where you enter the number of fighters and their stats mentioned above](Capture_Run_1)

## Code Example
The following code is how the attack roll and damage roll is done.
```
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
```
```
public static void getDamage(int die, int damMod, int[][] hp, int attacked) {
        int damage = getRandomNumber(1, die) + damMod;
        hp[attacked - 1][3] -= damage;
        if (hp[attacked - 1][3] < 0) {
            hp[attacked - 1][3] = 0;
        }
        System.out.println(damage + " damage! HP is " + hp[attacked - 1][3] + ".");
    }
```
