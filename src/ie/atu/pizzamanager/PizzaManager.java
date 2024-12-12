package ie.atu.pizzamanager;

public class PizzaManager {

    // Create array to store Pizza Objects
    private Pizza[] pizzas;

    // Constructor
    public PizzaManager() {
        //Initialize array to store 10 Pizza objects
        pizzas = new Pizza[100];
    }

    // Method to add a Pizza Object to the array 
    public void addPizza(Pizza pizza) {
        // Loop through array to find first empty slot 
        for (int i = 0; i < pizzas.length; i++) {
            // Check if slot is empty
            if (pizzas[i] == null) {
                // Add Watch Object to array
                pizzas[i] = pizza;
                // Exit Loop
                break;
            }
        }
    }

// Method to find the total number of Pizza objects in the array
public int totalPizzas() {
    // Initialize counter
    int total = 0;
    // Loop through array
    for (int i = 0; i < pizzas.length; i++) {
        // Check if slot is not empty
        if (pizzas[i] != null) {
            // Increment counter
            total++;
        }
    }
    // Return total number of Pizza objects
    return total;
}

}

