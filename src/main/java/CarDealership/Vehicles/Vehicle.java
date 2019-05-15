package CarDealership.Vehicles;

public abstract class Vehicle {
    private Engine engine;
    private Tyre tyre;
    private double price;
    private String colour;
    private double damage;

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

    public double getDamage() {
        return damage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDamage(double damage) {
        this.damage = damage;
//        this.price = this.price - damage/10 * this.price;
        this.price -= damage/10 * this.price;
    }

//    public void repairDamage(){
//        this.damage = 0;
//        this.
//    }
}
