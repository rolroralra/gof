package behavioral.mediator.impl;

import behavioral.mediator.Chatroom;
import behavioral.mediator.User;

public class ChatroomImpl extends Chatroom {
    @Override
    public void sendMessage(User sender, String message) {
        System.out.printf("[%s] %s%n", sender.getName(), message);
    }

    @Override
    public void sendMessage(User sender, User receiver, String message) {
        System.out.printf("[%s->%s] %s%n", sender.getName(), receiver.getName(), message);
    }
}
