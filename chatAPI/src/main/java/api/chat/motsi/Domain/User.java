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
