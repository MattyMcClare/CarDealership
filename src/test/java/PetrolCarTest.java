import CarDealership.Vehicles.Engine;
import CarDealership.Vehicles.PetrolCar;
import CarDealership.Vehicles.Tyre;
import org.junit.Before;
import org.junit.Test;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("Petrol");
        tyre = new Tyre("Dunlop");
        petrolCar = new PetrolCar(engine, tyre, 1000.00, "pink", 0);
    }

    @Test
    public void name() {
    }
}
