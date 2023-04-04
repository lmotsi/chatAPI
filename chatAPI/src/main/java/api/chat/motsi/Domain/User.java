package api.chat.motsi.Domain;

import java.util.ArrayList;

public class User {

    private String userName;
    private String passWord;

    private ArrayList<Chat> chats;

    public User(String name, String passWord) {
        this.userName = name;
        this.passWord = passWord;
        this.chats = new ArrayList<>();
    }

    public String getUserName() {
        return this.userName;
    }

    public void sendMessage(String text, User receiver) {
        Message message = new Message(text, this, receiver);
        for (Chat chat: this.chats) {
            if (chat.hasUsers(this, receiver)) {
                chat.addMessage(message);
            }
        }
    }

    public Boolean confirmPassWord(String enteredPassword) {
        return enteredPassword.equals(this.passWord);
    }
    @Override
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass()) return false;
        User otherUser = (User) o;
        return otherUser.getUserName().equals(this.userName);
    }

}
