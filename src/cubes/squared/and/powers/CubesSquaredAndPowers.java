/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cubes.squared.and.powers;

import java.util.Scanner;

/**
 *
 * @author thbar7035
 */
public class CubesSquaredAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice;
        double squared;
        double cubed;
        double power;
        double toThe;
        double powerTotal;
        
        System.out.println("What number do you want?");
        System.out.println("");
        System.out.println("1. Number squared");
        System.out.println("2. Number cubed");
        System.out.println("3. Find the value of a number. to any power");
        System.out.println("4. Exit");
        choice = keyedInput.nextInt();
        
        
        
        if (choice == 1){
           
            System.out.println("Choose your number to square");
            squared = keyedInput.nextInt();
            
       for (int i = 0; i <= 0; i = i + 1)

        {
            System.out.println(squared*squared);
        }
       
        }
        
        
       if (choice == 2){
            System.out.println("Choose your number to square");
            cubed = keyedInput.nextInt();
        
       for (int i = 0; i <= 0; i = i + 1)

        {
            System.out.println(cubed*cubed*cubed);
        }
        }

       if (choice == 3){
           System.out.println("Choose a number");
           power = keyedInput.nextInt();
           System.out.println("Choose a number to the power of the previous");
           toThe = keyedInput.nextInt();
           
           powerTotal = 1;
       
       for (int i = 0; i <= toThe-1; i = i + 1)

        {
            
            powerTotal = powerTotal*power;
            
        }
        System.out.println("The total is " + powerTotal);
        }

       
       if (choice >= 4){
           System.out.println("Seeya later aligator");
       }
       
       
    }
    
}
