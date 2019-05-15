import CarDealership.Vehicles.Engine;
import CarDealership.Vehicles.PetrolCar;
import CarDealership.Vehicles.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("Petrol");
        tyre = new Tyre("Dunlop");
        petrolCar = new PetrolCar(engine, tyre, 1000, "pink", 0);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, petrolCar.getEngine());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, petrolCar.getTyre());
    }

    @Test
    public void hasPrice() {
        assertEquals(1000, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("pink", petrolCar.getColour());
    }

    @Test
    public void hasDamage() {
        assertEquals(0, petrolCar.getDamage());
    }
}
