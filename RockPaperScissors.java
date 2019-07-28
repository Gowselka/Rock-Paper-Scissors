
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gowse
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        String userA = "";
        String userB = "";
        String trash = "";
        boolean validChoice = false;
        
        
        while (!validChoice)
        {
            //prompt user 1 for input
            System.out.println("");
            System.out.println("Rock Paper Scissors Game! ");
            System.out.println("");
            System.out.println("Player 1: Please choose your weapon!");
            System.out.print("Rock [R] / Paper [P] / Scissors [S] : ");
            //get players input 
            userA = in.next();
            
            if(!userA.equalsIgnoreCase("R") && !userA.equalsIgnoreCase("P") && !userA.equalsIgnoreCase("S"))
            {
               trash = in.nextLine();
               System.out.println("Please try again");
            }
            else
            {
               System.out.println("Player 1 has chosen.");
               userA = userA.toUpperCase(); 
               validChoice = true;
            }
            
            System.out.println("Player 2 choose your weapon!");
            System.out.print("Rock [R] / Paper [P] / Scissors [S] : ");
            
            userB = in.next();
            
        
        
        
            if(!userB.equalsIgnoreCase("R") && !userB.equalsIgnoreCase("P") && !userB.equalsIgnoreCase("S"))
            {
                trash = in.nextLine();
                System.out.println("Please try again");
                
            }
            else
            {
                System.out.println("Player 2 has chosen.");
                userB = userB.toUpperCase();
                validChoice = true;
            }
        
        } 
            // compare inputs (nested if's)
            
            if(userA.equals(userB))
            {
                System.out.println("It's a tie!");
            }
            else if(userA.equals("R"))
            {
                if(userB.equals("S"))
                    System.out.println("Rock breaks Scissors! Player 1 Wins!");
                else if(userB.equals("P"))
                    System.out.println("Paper covers Rock! Player 2 Wins!");
            }
            else if(userA.equals("P"))
            {
                if(userB.equals("R"))
                    System.out.println("Paper covers Rock! Player 1 Wins!");
                else if(userB.equals("S"))
                    System.out.println("Scissors cuts Paper! Player 2 Wins!");
            }
            else if(userA.equals("S"))
            {
                if(userB.equals("P"))
                    System.out.println("Scissors cuts Paper! Player 1 Wins!");
                else if(userB.equals("R"))
                    System.out.println("Rock Breaks Scissors. Player 2 Wins!");
            }
            
    }
            
            
            
        }
        
        
        
        
        
        
        
        
    
    

