import CarDealership.Vehicles.ElectricCar;
import CarDealership.Vehicles.Engine;
import CarDealership.Vehicles.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    Engine engine;
    Tyre tyre;
    ElectricCar electricCar;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("Electric");
        tyre = new Tyre("Goodyear");
        electricCar = new ElectricCar(engine, tyre, 34000.00, "silver", 0);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, electricCar.getEngine());
    }

    @Test
    public void hasTyre() {
        assertEquals(tyre, electricCar.getTyre());
    }

    @Test
    public void hasPrice() {
        assertEquals(34000.00, electricCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("silver", electricCar.getColour());
    }

    @Test
    public void hasDamage() {
        assertEquals(0, electricCar.getDamage());
    }
}
