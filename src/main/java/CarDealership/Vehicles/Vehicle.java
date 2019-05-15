package CarDealership.Vehicles;

public abstract class Vehicle {
    private Engine engine;
    private Tyre tyre;
    private double price;
    private String colour;
    private int damage;

    public Vehicle(Engine engine, Tyre tyre, double price, String colour, int damage) {
        this.engine = engine;
        this.tyre = tyre;
        this.price = price;
        this.colour = colour;
        this.damage = damage;


    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getDamage() {
        return damage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void repairDamage(){
        this.damage = 0;
        //change price etc
    }
}
