package behavioral.mediator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private Chatroom chatroom;

    public User(String name) {
        this.name = name;
    }

    public void enterChatroom(Chatroom chatroom) {
        chatroom.addUser(this);
        setChatroom(chatroom);
    }

    public void leaveChatroom() {
        if (this.chatroom == null) {
            return;
        }

        this.chatroom.removeUser(this);
        this.chatroom = null;
    }

    public void sendMessage(String message) {
        chatroom.sendMessage(this, message);
    }

    public void sendMessage(User receiver, String message) {
        chatroom.sendMessage(this, receiver, message);
    }

    @Override
    public String toString() {
        return "User{" + this.name + "}";
    }
}
