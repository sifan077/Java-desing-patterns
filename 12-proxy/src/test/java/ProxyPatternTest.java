import com.sifan.Image;
import com.sifan.ProxyImage;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProxyPatternTest {

    @Test
    public void testDisplay() {
        // 创建一个代理图像对象
        Image image = new ProxyImage("test.jpg");

        // 第一次调用 display() 方法，图像将从磁盘加载
        String output1 = image.display();
        assertEquals("Displaying test.jpg", output1);

        // 第二次调用 display() 方法，图像将不会从磁盘加载
        String output2 = image.display();
        assertEquals("Displaying test.jpg", output2);
    }
}