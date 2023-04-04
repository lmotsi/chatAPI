package api.chat.motsi.Domain;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    public static int numberOfChats;
    private ArrayList<Message> messages;
    private int chatID;
    private ArrayList<User> users;

    public Chat(User user1, User user2) {
        this.users = new ArrayList<>();
        this.users.add(user1);
        this.users.add(user2);
        this.messages = new ArrayList<>();

    }

    public Chat generateID() {
        this.chatID = Chat.numberOfChats+1;
        Chat.numberOfChats++;
        return this;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public boolean hasUsers(User a, User b) {
        return has(a) && has(b);

    }

    private boolean has(User user) {
        for (User inChat : this.users) {
            if (user.equals(inChat)) {
                return true;
            }
        }
        return false;
    }
}
