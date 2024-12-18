package ie.atu.pizzamanager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PizzaManager {
   
   
    private ArrayList<Pizza> pizzas; // List to store all pizza objects

    // Constructor
    public PizzaManager() {
        this.pizzas = new ArrayList<>();
    }

    // Add a new pizza to the list
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        System.out.println("Pizza added successfully!");
    }

    // Delete a pizza by its ID
    public boolean deletePizza(int id) {
        for (Pizza pizza : pizzas) {
            if (pizza.getPizzaId() == id) {
                pizzas.remove(pizza);
                
                return true;
            }
        }
        System.out.println("Pizza with ID " + id + " not found.");
        return false;
    }

    // Get the total number of pizzas
    public int totalPizzas() {
        return pizzas.size();
    }

    // Search for a pizza by its ID
    public Pizza searchPizzaById(int id) {
        for (Pizza pizza : pizzas) {
            if (pizza.getPizzaId() == id) {
                return pizza;
            }
        }
        return null;
    }
     public Set<String> getAllToppings() {
        Set<String> toppingsSet = new HashSet<>();
        for (Pizza pizza : pizzas) {
            toppingsSet.add(pizza.getToppings());
        }
        return toppingsSet; // Returns a set of unique toppings
    }
}




    

    

   
