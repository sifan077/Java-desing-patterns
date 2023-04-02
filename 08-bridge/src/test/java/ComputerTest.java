import com.sifan.brand.AsusBrand;
import com.sifan.brand.Brand;
import com.sifan.brand.DellBrand;
import com.sifan.type.Computer;
import com.sifan.type.Desktop;
import com.sifan.type.Laptop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {

    @Test
    public void testDesktop() {
        Brand asus = new AsusBrand();
        Computer desktop = new Desktop(asus);
        assertEquals("华硕台式电脑", desktop.info());
    }

    @Test
    public void testLaptop() {
        Brand dell = new DellBrand();
        Computer laptop = new Laptop(dell);
        assertEquals("戴尔笔记本电脑", laptop.info());
    }
}