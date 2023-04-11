import com.sifan.ChatRoom;
import com.sifan.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChatRoomTest {
    @Test
    public void testSendMessage() {
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        String message1 = " says hi!";
        String message2 = " says hello!";
        String expectedMessage1 = new Date().toString() + " [" + user1.getName() + "] : " + message1;
        String expectedMessage2 = new Date().toString() + " [" + user2.getName() + "] : " + message2;
        System.out.println(expectedMessage1);
        System.out.println(expectedMessage2);
        assertEquals(expectedMessage1, ChatRoom.showMessage(user1, message1));
        assertEquals(expectedMessage2, ChatRoom.showMessage(user2, message2));
    }
}