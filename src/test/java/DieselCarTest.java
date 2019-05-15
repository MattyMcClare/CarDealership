import CarDealership.Vehicles.DieselCar;
import CarDealership.Vehicles.Engine;
import CarDealership.Vehicles.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    Engine engine;
    Tyre tyre;
    DieselCar dieselCar;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("Diesel");
        tyre = new Tyre("Continental");
        dieselCar = new DieselCar(engine, tyre, 5000, "yellow", 0);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, dieselCar.getEngine());
    }

    @Test
    public void hasTyre() {
        assertEquals(tyre, dieselCar.getTyre());
    }

    @Test
    public void hasPrice() {
        assertEquals(5000, dieselCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("yellow", dieselCar.getColour());
    }

    @Test
    public void hasDamage() {
        assertEquals(0, dieselCar.getDamage());
    }
}
