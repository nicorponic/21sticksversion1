/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21sticksassignment;

import java.util.Scanner;

/**
 * @author N1CO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sticks = 21;
        System.out.println("Go 1st? y/n?");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        Scanner take = new Scanner(System.in);
        int toTake = 0;
        
        
        while (sticks > 0) {
            if (first.equals("y") || first.equals("Y")) {
                System.out.println("there are " + sticks + " sticks");
                System.out.println("How many you want to take? 1 or 2?");
                toTake = take.nextInt();

                if (toTake > 2) {
                    toTake = 2;
                } else if (toTake < 1) {
                    toTake = 1;
                }
                sticks = sticks - toTake;

                if (sticks <= 0) {
                    System.out.println("You Lost!");
                } else {
                    if ((sticks - 2) % 3 == 0 || sticks - 2 == 0) {
                        toTake = 1;
                    } else {
                        toTake = 2;
                    }
                    System.out.println("AI takes " + toTake + " sticks. Your turn");
                    sticks = sticks - toTake;

                    if (sticks <= 0) {
                        System.out.println("You win ! ! !");
                    }
                }
            } 
            else {
                if ((sticks - 2) % 3 == 0 || sticks - 2 == 0) {
                    toTake = 1;
                } else {
                    toTake = 2;
                }
                System.out.println("AI took " + toTake + "sticks");
                sticks = sticks - toTake;
                
                if (sticks <= 0) {
                    System.out.println("You Win ! ! !");
                } 
                else {
                    System.out.println("There are " + sticks + "sticks left");
                    System.out.println("How many sticks do you want to take? 1 or 2");
                    toTake = take.nextInt();

                    if (toTake > 2) {
                        toTake = 2;
                    } else if (toTake < 1) {
                        toTake = 1;
                    }
                    sticks = sticks - toTake;

                    if (sticks <= 0) {
                        System.out.println("You lost!");
                    }
                }
            }
        }

    }
}
    
