import org.junit.Before;
import org.junit.Test;
import people.Dealer;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer("Bob", 500000.00);
    }
    @Test
    public void canGetDealerName(){
        assertEquals("Bob", dealer.getName());
    }

    @Test
    public void canGetDealerMoney(){
        assertEquals(500000.00, dealer.getMoney(), 0.01);
    }
}
