import java.time.format.DateTimeFormatter;

public class Message {
    public User toUser;
    public User fromUser;
    public String text;
    public String date;

    public Message(User fromUser, User toUser, String text) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.text = text;
    }

    @Override
    public String toString() {
        return "от: " + fromUser.getName() +
                "кому: " + toUser.getName() +
                "текст: " + text +
                "дата" + date;
    }
}
