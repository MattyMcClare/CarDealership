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
        petrolCar = new PetrolCar(engine, tyre, 10000, "pink", 0);
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
        assertEquals(10000, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("pink", petrolCar.getColour());
    }

    @Test
    public void hasDamage() {
        assertEquals(0, petrolCar.getDamage(),0);
    }

    @Test
    public void canSetPrice() {
        petrolCar.setPrice(9000);
        assertEquals(9000, petrolCar.getPrice(), 0);
    }

    @Test
    public void canSetDamage() {
        petrolCar.setDamage(3);
        assertEquals(3, petrolCar.getDamage(),0);
        assertEquals(7000, petrolCar.getPrice(), 0.01);
    }

//    @Test
//    public void canResetDamage() {
//        petrolCar.setDamage(4);
////        petrolCar.repairDamage();
//        assertEquals(0, petrolCar.getDamage());
//
//    }
}
