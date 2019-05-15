import CarDealership.Vehicles.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        tyre = new Tyre("Dunlops");
    }

    @Test
    public void name() {
        assertEquals("Dunlops", tyre.getTyre());
    }
}
