import CarDealership.Vehicles.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() {
        engine = new Engine("Petrol");
    }

    @Test
    public void hasEngineType() {
        assertEquals("Petrol", engine.getEngine());
    }
}
