package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Chatroom {
    protected List<User> userList;

    public Chatroom() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        if (userList.contains(user)) {
            return;
        }

        userList.add(user);
        sendMessage(user, String.format("%s님이 채팅방에 들어오셨습니다.", user.getName()));
    }

    public void removeUser(User user) {
        if (userList.contains(user)) {
            sendMessage(user, String.format("%s님이 채팅방을 나가셨습니다.", user.getName()));
            userList.remove(user);
        }
    }

    abstract public void sendMessage(User sender, String message);

    abstract public void sendMessage(User sender, User receiver, String message);
}
