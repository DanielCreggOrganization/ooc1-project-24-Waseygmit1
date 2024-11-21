package ie.atu.pizzamanager;

public class Pizza {

    // Instance Variables
    private int pizzaId; // Unique ID
    private String toppings;
    private float priceEur;
    private boolean isVegan;

    // Constructor
    public Pizza(int pizzaId , String toppings , float price , boolean isVegan){
        this.pizzaId = pizzaId;
        this.toppings = toppings;
        this.priceEur = price;
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
        return this.priceEur;
    }

    public void setPrice(float price){
        this.priceEur = price;
    }

    public boolean getIsVegan(){
        return this.isVegan;
    }

    public void setIsVegan(boolean isVegan){
        this.isVegan = isVegan;
    }
}
