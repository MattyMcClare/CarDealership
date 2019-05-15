import CarDealership.Business.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setUp() throws Exception {
        till = new Till(10000);
    }

    @Test
    public void hasBalance() {
        assertEquals(10000, till.getBalance(),0);
    }

    @Test
    public void increaseBalance() {
        till.increaseBalance(1000);
        assertEquals(11000, till.getBalance(),0);
    }

    @Test
    public void decreaseBalance() {
        till.decreaseBalance(1000);
        assertEquals(9000, till.getBalance(),0);
    }
}
