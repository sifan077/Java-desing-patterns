import com.sifan.classAdapter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassAdapterTest {

    @Test
    public void testClassAdapter() {
        ChineseSocket chineseSocket = new ChineseSocketImpl(); // 使用中国双叉插头
        EuropeSocket europeSocket = new ChineseAdapterEurope(); // 使用适配器将中国双叉插头转换成欧式三叉插头

        Computer computer = new Computer();
        assertEquals("使用中国双叉充电", computer.useChineseSocket(chineseSocket));
        assertEquals("使用欧式三叉充电", europeSocket.useEuropeSocket());
        // 注意这里调用的是适配器类的方法，而不是 Computer 类的方法
    }
}
