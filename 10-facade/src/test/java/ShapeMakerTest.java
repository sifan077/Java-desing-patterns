import com.sifan.ShapeMaker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeMakerTest {

    @Test
    public void testDrawCircle() {
        ShapeMaker shapeMaker = new ShapeMaker();
        String result = shapeMaker.drawCircle();
        assertEquals("我是圆形", result);
    }

    @Test
    public void testDrawRectangle() {
        ShapeMaker shapeMaker = new ShapeMaker();
        String result = shapeMaker.drawRectangle();
        assertEquals("我是矩形", result);
    }

    @Test
    public void testDrawSquare() {
        ShapeMaker shapeMaker = new ShapeMaker();
        String result = shapeMaker.drawSquare();
        assertEquals("我是正方形", result);
    }

    @Test
    public void testDrawTriangle() {
        ShapeMaker shapeMaker = new ShapeMaker();
        String result = shapeMaker.drawTriangle();
        assertEquals("我是三角形", result);
    }
}