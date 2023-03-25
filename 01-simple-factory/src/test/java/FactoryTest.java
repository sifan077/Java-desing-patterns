import com.sifan.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FactoryTest {

    @Test
    public void testCar() {

    }

    @Test
    public void testCreateAudiCar() {
        Car car = Factory.createCar("audi");
        Assertions.assertNotNull(car);
        Assertions.assertTrue(car instanceof AudiCar);
        car.drive();
    }

    @Test
    public void testCreateBenzCar() {
        Car car = Factory.createCar("benz");
        Assertions.assertNotNull(car);
        Assertions.assertTrue(car instanceof BenzCar);
        car.drive();
    }

    @Test
    public void testCreateVWCar() {
        Car car = Factory.createCar("vw");
        Assertions.assertNotNull(car);
        Assertions.assertTrue(car instanceof VWCar);
        car.drive();
    }

    @Test
    public void testCreateUnknownCar() {
        Car car = Factory.createCar("unknown");
        Assertions.assertNull(car);
    }

    @Test
    public void testCreateNullCar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factory.createCar(null);
        });
    }

    @Test
    public void testCreateEmptyCar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factory.createCar("");
        });
    }
}
