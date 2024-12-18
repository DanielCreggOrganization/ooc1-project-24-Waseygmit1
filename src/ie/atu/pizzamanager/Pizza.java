package ie.atu.pizzamanager;

public class Pizza {

    private int pizzaId;
    private String toppings;
    private float priceEur;
    private boolean isVegan;

    // Constructor
    public Pizza(int pizzaId, String toppings, float priceEur, boolean isVegan) {
        this.pizzaId = pizzaId;
        this.toppings = toppings;
        this.priceEur = priceEur;
        this.isVegan = isVegan;
    }

    // Getter methods
    public int getPizzaId() {
        return pizzaId;
    }

    public String getToppings() {
        return toppings;
    }

    public float getPriceEur() {
        return priceEur;
    }

    public boolean isVegan() {
        return isVegan;
    }

    // Overriding toString() method to provide a readable output
    @Override
    public String toString() {
        return "Pizza ID: " + pizzaId + ", Toppings: " + toppings + ", Price: €" + priceEur
                + ", Vegan: " + (isVegan ? "Yes" : "No");
    }
}
