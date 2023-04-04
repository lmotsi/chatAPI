package api.chat.motsi.Domain;

public class User {

    private String userName;
    private String passWord;

    public User(String name, String passWord) {
        this.userName = name;
        this.passWord = passWord;
    }

    public String getUserName() {
        return this.userName;
    }


}
