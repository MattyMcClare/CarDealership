import CarDealership.Vehicles.Engine;
import CarDealership.Vehicles.HybridCar;
import CarDealership.Vehicles.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    Engine engine;
    Tyre tyre;
    HybridCar hybridCar;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("hybrid");
        tyre = new Tyre("Michelin");
        hybridCar = new HybridCar(engine, tyre, 50000.00, "purple", 0);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, hybridCar.getEngine());
    }

    @Test
    public void hasTyre() {
        assertEquals(tyre, hybridCar.getTyre());
    }

    @Test
    public void hasPrice() {
        assertEquals(50000.00, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("purple", hybridCar.getColour());
    }

    @Test
    public void hasDamage() {
        assertEquals(0, hybridCar.getDamage());
    }
}
