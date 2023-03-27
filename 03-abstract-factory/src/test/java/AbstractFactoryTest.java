import com.sifan.factory.AbstractFactory;
import com.sifan.factory.ProductFactory1;
import com.sifan.factory.ProductFactory2;
import com.sifan.product.producta.AbstractProductA;
import com.sifan.product.producta.ProductA1;
import com.sifan.product.producta.ProductA2;
import com.sifan.product.productb.AbstractProductB;
import com.sifan.product.productb.ProductB1;
import com.sifan.product.productb.ProductB2;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AbstractFactoryTest {

    @Test
    public void testProductFactory1() {
        AbstractFactory factory = new ProductFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        assertNotNull(productA);
        assertNotNull(productB);
        assertTrue(productA instanceof ProductA1);
        assertTrue(productB instanceof ProductB1);

        productA.use();
        productB.eat();
    }

    @Test
    public void testProductFactory2() {
        AbstractFactory factory = new ProductFactory2();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        assertNotNull(productA);
        assertNotNull(productB);
        assertTrue(productA instanceof ProductA2);
        assertTrue(productB instanceof ProductB2);

        productA.use();
        productB.eat();
    }
}