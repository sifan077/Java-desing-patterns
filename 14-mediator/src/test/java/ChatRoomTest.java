import com.sifan.ChatRoom;
import com.sifan.User;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChatRoomTest {
    @Test
    public void testSendMessage() {
        // 重定向标准输出到内存流
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            // 创建中介者和用户
            ChatRoom chatRoom = new ChatRoom();
            User user1 = new User("Alice");
            User user2 = new User("Bob");

            // 发送消息
            user1.sendMessage(" says hi!", chatRoom);
            user2.sendMessage(" says hello!", chatRoom);

            // 获取输出内容
            String output = outContent.toString();

            // 验证输出包含期望的内容
            assertTrue(output.contains("[Alice] :  says hi!"));
            assertTrue(output.contains("[Bob] :  says hello!"));

        } finally {
            // 恢复标准输出
            System.setOut(originalOut);
        }
    }
}