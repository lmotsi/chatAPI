package api.chat.motsi.Domain;

import java.util.ArrayList;

public class Chat {
    public static int numberOfChats;
    private ArrayList<Message> messages;
    private int chatID;

    public Chat() {
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

}
