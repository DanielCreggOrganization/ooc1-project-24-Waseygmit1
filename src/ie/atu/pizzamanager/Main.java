package ie.atu.pizzamanager;

import java.util.Scanner;

public class Main {

    // ANSI Escape Codes for Colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String MAGENTA = "\u001B[35m";

    public static void main(String[] args) {

        // Create PizzaManager object
        PizzaManager pizzaManagerObject = new PizzaManager();

        // Instantiate Scanner class so we can start reading user input
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0; // Used to store user Menu option selection

        // Create infinite while loop to display Menu after every command
        while (true) {
            // Display Menu with colours 
            System.out.println("");
            System.out.println(CYAN + "##################################");
            System.out.println(CYAN + "#       Pizza Manager v1.2       #");
            System.out.println(CYAN + "##################################");
            System.out.println(GREEN + "(1) Add a Pizza.");
            System.out.println(YELLOW + "(2) Delete a Pizza.");
            System.out.println(BLUE + "(3) Show total Number of Pizzas.");
            System.out.println(MAGENTA + "(4) Search for a Pizza by ID.");
            System.out.println(RED + "(5) Quit.");
            System.out.println(RESET + "Select an option from 1 to 5 and press Enter>");

            // Store user Menu option selection
            userSelection = userInput.nextInt();

            // If user selects option 1
            if (userSelection == 1) {
                // Ask user to enter Pizza details
                System.out.println("Enter Pizza Unique ID:");
                int pizzaId = userInput.nextInt();
                System.out.println("Enter Pizza Toppings:");
                String toppings = userInput.next();
                System.out.println("Enter Pizza Price:");
                float priceEur = userInput.nextFloat();
                System.out.println("Is Pizza Vegan? (true/false):");
                boolean isVegan = userInput.nextBoolean();

                // Create Pizza object
                Pizza myPizza = new Pizza(pizzaId, toppings, priceEur, isVegan);
                pizzaManagerObject.addPizza(myPizza);
            } // end if

            // If user selects option 3
            if (userSelection == 3) {
                // Display total number of Pizza objects
                System.out.println("Total Number of Pizzas: " + pizzaManagerObject.totalPizzas());
            }

            // If user selects option 5
            if (userSelection == 5) { // Quit
                System.out.println(RED + "Pizza Application Closing - Goodbye!" + RESET);
                // Close the User Input Scanner
                userInput.close();
                break; // Break out of display Menu infinite loop
            } // end if
        } // end while
    } // end main method
} // end Main class