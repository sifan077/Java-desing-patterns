import com.sifan.*;
import org.junit.*;

import java.util.List;

public class BrokerTest {
    private Stock stock;
    private Broker broker;

    @Before
    public void setUp() {
        stock = new Stock();
        broker = new Broker();
    }

    @Test
    public void testBuyStock() {
        Order buyStock = new BuyStock(stock);
        broker.takeOrder(buyStock);
        List<String> result = broker.placeOrders();
        String expectedOutput = "Stock [ Name: ABC, Quantity: 10 ] bought";
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(expectedOutput, result.get(0));
    }

    @Test
    public void testSellStock() {
        Order sellStock = new SellStock(stock);
        broker.takeOrder(sellStock);
        List<String> result = broker.placeOrders();
        String expectedOutput = "Stock [ Name: ABC, Quantity:10 ] sold ";
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(expectedOutput, result.get(0));
    }
}