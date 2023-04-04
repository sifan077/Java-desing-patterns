import com.sifan.component.MilkTea;
import com.sifan.concreteComponent.ChocolateMT;
import com.sifan.concreteComponent.PuddingMT;
import com.sifan.concreteDecorator.Coconut;
import com.sifan.concreteDecorator.Pearl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MilkTeaTest {

    @Test
    public void testChocolateMT() {
        MilkTea chocolateMT = new ChocolateMT();
        assertEquals("巧克力奶茶", chocolateMT.getDescription());
        assertEquals(15.0, chocolateMT.getPrice(), 0.001);
    }

    @Test
    public void testPuddingMT() {
        MilkTea puddingMT = new PuddingMT();
        assertEquals("布丁奶茶", puddingMT.getDescription());
        assertEquals(12.0, puddingMT.getPrice(), 0.001);
    }

    @Test
    public void testCoconut() {
        MilkTea chocolateCoconut = new Coconut(new ChocolateMT());
        assertEquals("添加椰果巧克力奶茶", chocolateCoconut.getDescription());
        assertEquals(20.0, chocolateCoconut.getPrice(), 0.001);

        MilkTea puddingCoconut = new Coconut(new PuddingMT());
        assertEquals("添加椰果布丁奶茶", puddingCoconut.getDescription());
        assertEquals(17.0, puddingCoconut.getPrice(), 0.001);
    }

    @Test
    public void testPearl() {
        MilkTea chocolatePearl = new Pearl(new ChocolateMT());
        assertEquals("添加珍珠巧克力奶茶", chocolatePearl.getDescription());
        assertEquals(18.0, chocolatePearl.getPrice(), 0.001);

        MilkTea puddingPearl = new Pearl(new PuddingMT());
        assertEquals("添加珍珠布丁奶茶", puddingPearl.getDescription());
        assertEquals(15.0, puddingPearl.getPrice(), 0.001);
    }

    @Test
    public void testCoconutPearl() {
        MilkTea chocolateCoconutPearl = new Pearl(new Coconut(new ChocolateMT()));
        assertEquals("添加珍珠添加椰果巧克力奶茶", chocolateCoconutPearl.getDescription());
        assertEquals(23.0, chocolateCoconutPearl.getPrice(), 0.001);

        MilkTea puddingCoconutPearl = new Pearl(new Coconut(new PuddingMT()));
        assertEquals("添加珍珠添加椰果布丁奶茶", puddingCoconutPearl.getDescription());
        assertEquals(20.0, puddingCoconutPearl.getPrice(), 0.001);
    }
}
