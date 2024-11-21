package ie.atu.pizzamanager;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       
    
      //instantiate Scanner class so we can start reading user input
      Scanner userInput = new Scanner(System.in);
      int userSelection = 0; // Used to store user Menu option selection

      // Create infinite while loop to display Menu after every command
      while (true) {
        // Display Menu to Console
        System.out.println("");
        System.out.println("###################################");
        System.out.println("#     Pizza Manager v0.9  #");
        System.out.println("###################################");
        System.out.println("(1) Add a Pizza.");
        System.out.println("(2) Delete a Pizza");
        System.out.println("(3) Show total number of pizzas.");
        System.out.println("(4) Search for Pizza by Id");
        System.out.println("(5) Quit.");
        System.out.println("Select an option from 1 to 5 and press Enter>");

        // Store user Menu option selection
        userSelection = userInput.nextInt();

        if (userSelection == 5) {// Quit

            System.out.println("Pizza Manager Closing - Goodbye!");
            // Close the User Input Scanner 
            userInput.close();
            break; // Break out of display menu Infinite loop 

        }
      }
    }
}
