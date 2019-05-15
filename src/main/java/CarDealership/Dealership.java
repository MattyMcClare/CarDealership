package CarDealership;

import CarDealership.Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> available;
    private ArrayList<Vehicle> rented;

    public Dealership() {
        this.available = new ArrayList<>();
        this.rented = new ArrayList<>();
    }

    public int countAvailable(){
        return available.size();
    }

    public int countRented(){
        return available.size();
    }

    public void addVehicleToAvailable(Vehicle vehicle){
        available.add(vehicle);
    }

    public void removeVehicleFromAvailable(Vehicle vehicle){
        if (available.contains(vehicle)){
            available.remove(vehicle);
        }
    }

    public void addVehicleToRented(Vehicle vehicle){
        rented.add(vehicle);
    }

    public void removeVehicleFromRented(Vehicle vehicle){
        if (rented.contains(vehicle)){
            rented.remove(vehicle);
        }
    }

    public void repairVehicle(Vehicle vehicle){
        vehicle.repairDamage();
    }
}
