package behavioral.mediator.test;

import behavioral.mediator.Chatroom;
import behavioral.mediator.User;
import behavioral.mediator.impl.ChatroomImpl;
import org.junit.jupiter.api.Test;

public class ChatroomTest {
    @Test
    void testChatroom() {
        Chatroom chatroom = new ChatroomImpl();

        User[] users = new User[] {
                new User("admin"),
                new User("user1"),
                new User("user2"),
                new User("user3"),
                new User("user4"),
        };


        for (User user : users) {
            user.enterChatroom(chatroom);
            user.sendMessage(String.format("안녕하세요! %s 입니다.", user.getName()));
        }

        users[0].sendMessage(users[2], "운영권 넘겨주시길 바랍니다.");
        users[2].sendMessage(users[0], "넵!");

        for (User user : users) {
            user.sendMessage("좋은하루 되세요~");
            user.leaveChatroom();
        }
    }
}
