import CarDealership.Dealership;
import CarDealership.Vehicles.Engine;
import CarDealership.Vehicles.PetrolCar;
import CarDealership.Vehicles.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        dealership = new Dealership();
        engine = new Engine("Petrol");
        tyre = new Tyre("Dunlop");
        petrolCar = new PetrolCar(engine, tyre, 1000, "pink", 0);
    }

    @Test
    public void hasEmptyArrayLists() {
        assertEquals(0,dealership.countAvailable());
        assertEquals(0,dealership.countRented());
    }

    @Test
    public void addVehicle() {
        dealership.addVehicleToAvailable(petrolCar);
        assertEquals(1, dealership.countAvailable());
    }

    @Test
    public void removeVehicle() {
        dealership.addVehicleToAvailable(petrolCar);
        dealership.removeVehicleFromAvailable(petrolCar);
        assertEquals(0, dealership.countAvailable());
    }

    @Test
    public void addVehicleRented() {
        dealership.addVehicleToRented(petrolCar);
        assertEquals(1, dealership.countRented());
    }

    @Test
    public void removeVehicleRented() {
        dealership.addVehicleToRented(petrolCar);
        dealership.removeVehicleFromRented(petrolCar);
        assertEquals(0, dealership.countRented());
    }
}
