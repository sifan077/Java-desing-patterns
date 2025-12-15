import com.sifan.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FactoryTest {

    @Test
    public void testCar() {
        // 测试基本功能
    }

    // 使用枚举的类型安全测试
    @Test
    public void testCreateAudiCarWithEnum() {
        Car car = Factory.createCar(CarType.AUDI);
        Assertions.assertNotNull(car);
        Assertions.assertTrue(car instanceof AudiCar);
        car.drive();
    }

    @Test
    public void testCreateBenzCarWithEnum() {
        Car car = Factory.createCar(CarType.BENZ);
        Assertions.assertNotNull(car);
        Assertions.assertTrue(car instanceof BenzCar);
        car.drive();
    }

    @Test
    public void testCreateVWCarWithEnum() {
        Car car = Factory.createCar(CarType.VW);
        Assertions.assertNotNull(car);
        Assertions.assertTrue(car instanceof VWCar);
        car.drive();
    }

    // 保留字符串测试，但使用更好的断言
    @Test
    public void testCreateCarWithString() {
        Car car = Factory.createCar("audi");
        Assertions.assertNotNull(car);
        Assertions.assertTrue(car instanceof AudiCar);
        car.drive();
    }

    @Test
    public void testCreateUnknownCar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factory.createCar("unknown");
        });
    }

    @Test
    public void testCreateNullCar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factory.createCar((CarType) null);
        });
    }

    @Test
    public void testCreateEmptyCar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factory.createCar("");
        });
    }
    
    @Test
    public void testCreateNullString() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factory.createCar((String) null);
        });
    }
}
