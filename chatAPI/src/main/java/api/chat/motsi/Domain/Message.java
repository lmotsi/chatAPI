package api.chat.motsi.Domain;

public class Message {
    private String text;
    private User sender;
    private User receiver;

    public Message(String text, User sender, User receiver) {
        this.text = text;
        this.sender = sender;
        this.receiver = receiver;
    }

}
