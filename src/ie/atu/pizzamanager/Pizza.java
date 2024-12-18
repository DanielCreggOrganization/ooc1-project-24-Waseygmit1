package ie.atu.pizzamanager;

public class Pizza extends Food {
    private String toppings; // Specific to Pizza
    private boolean isVegan; // Specific to Pizza

    // Constructor
    public Pizza(int id, String toppings, float price, boolean isVegan) {
        super(id, "Pizza", price); // Call the Food constructor
        this.toppings = toppings;
        this.isVegan = isVegan;
    }

    // Getters and Setters
    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    // Overridden method from Food Interface
    @Override
    public String showTaste() {
        return "Salty ";
    }
}

