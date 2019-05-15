package CarDealership.Business;

import CarDealership.Vehicles.Vehicle;

public class Customer {
    private double money;
    private String name;
    private Vehicle vehicle;

    public Customer(double money, String name, Vehicle vehicle) {
        this.money = money;
        this.name = name;
        this.vehicle = vehicle;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void removeVehicle(){
        vehicle = null;
    }

    public void takeVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void addMoney(double amount){
        money += amount;
    }

    public void reduceMoney(double amount){
        money -= amount;
    }
}
