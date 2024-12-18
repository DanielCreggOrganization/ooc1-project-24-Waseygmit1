package ie.atu.pizzamanager;

public abstract class Food {
    private int id;
    private String name;
    private float price;

    // Constructor
    public Food(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    public abstract String showTaste();

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}