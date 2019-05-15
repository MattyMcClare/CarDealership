import CarDealership.Business.Customer;
import CarDealership.Vehicles.Engine;
import CarDealership.Vehicles.PetrolCar;
import CarDealership.Vehicles.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        customer = new Customer(5000, "Harry", null);
        engine = new Engine("Petrol");
        tyre = new Tyre("Dunlop");
        petrolCar = new PetrolCar(engine, tyre, 1000, "pink", 0);
    }


    @Test
    public void hasInfo() {
        assertEquals(5000, customer.getMoney(),0);
        assertEquals("Harry", customer.getName());
        assertEquals(null, customer.getVehicle());
    }

    @Test
    public void assignVehicle() {
        customer.takeVehicle(petrolCar);
        assertEquals(petrolCar, customer.getVehicle());
    }

    @Test
    public void removeVehicle() {
        customer.takeVehicle(petrolCar);
        customer.removeVehicle();
        assertEquals(null, customer.getVehicle());
    }

    @Test
    public void increaseCustomerMoney() {
        customer.addMoney(500);
        assertEquals(5500, customer.getMoney(),0);
    }

    @Test
    public void decreaseCustomerMoney() {
        customer.reduceMoney(500);
        assertEquals(4500, customer.getMoney(),0);
    }
}
