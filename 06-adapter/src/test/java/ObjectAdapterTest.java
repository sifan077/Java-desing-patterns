import com.sifan.objectAdapter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObjectAdapterTest {

    @Test
    public void testObjectAdapter() {
        // 实例化中国插头和欧式插座
        ChineseSocket chineseSocket = new ChineseSocketImpl();
        EuropeSocket europeSocket = new EuropeSocketImpl();

        // 使用中国插头充电
        Computer computer = new Computer();
        String result1 = computer.useChineseSocket(chineseSocket);
        assertEquals("使用中国双叉充电", result1);

        // 使用欧式插座充电
        String result2 = europeSocket.useEuropeSocket();
        assertEquals("使用欧式三叉充电", result2);

        // 使用适配器将欧式插座转换为中国插头
        ChineseAdapterEurope adapter = new ChineseAdapterEurope(europeSocket);
        String result3 = adapter.useChineseSocket();
        assertEquals("使用欧式三叉充电", result3);

        // 使用适配器将欧式插座转换为中国插头并充电
        String result4 = computer.useChineseSocket(adapter);
        assertEquals("使用欧式三叉充电", result4);
    }
}