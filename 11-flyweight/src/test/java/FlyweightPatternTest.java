import com.sifan.AbstractBox;
import com.sifan.BoxFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlyweightPatternTest {
    @Test
    public void testFlyweightPattern() {
        BoxFactory factory = BoxFactory.getInstance();

        // 获取 I 形状的图形对象
        AbstractBox box1 = factory.getBox("I");
        // 获取 I 形状的图形对象
        AbstractBox box2 = factory.getBox("I");
        // 获取 L 形状的图形对象
        AbstractBox box3 = factory.getBox("L");

        // 检查获取的图形对象是否相同
        assertSame(box1, box2);
        assertNotSame(box1, box3);

        // 检查图形对象的形状和颜色是否正确
        assertEquals("I", box1.getShape());
        assertEquals("方块形状：I 颜色：红色", box1.display("红色"));

        assertEquals("L", box3.getShape());
        assertEquals("方块形状：L 颜色：蓝色", box3.display("蓝色"));
    }
}