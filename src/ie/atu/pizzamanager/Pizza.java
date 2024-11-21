package ie.atu.pizzamanager;

public class Pizza {

    // Instance Variables
    private int pizzaId; // Unique ID
    private String toppings;
    private float price;
    private boolean isVegan;

    // Constructor
    public Pizza(int pizzaId , String toppings , float price , boolean isVegan){
        this.pizzaId = pizzaId;
        this.toppings = toppings;
        this.price = price;
        this.isVegan = isVegan;
    }

    //Getter and Setter Methods
    public int getPizzaId(){
        return this.pizzaId;
    }


    public void setPizzaId(int pizzaId){
        this.pizzaId = pizzaId;
    }

    public String getToppings(){
        return this.toppings;
    }

    public void setToppings(String toppings){
        this.toppings = toppings;
    }
     
    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public boolean getIsVegan(){
        return this.isVegan;
    }

    public void setIsVegan(boolean isVegan){
        this.isVegan = isVegan;
    }
}
