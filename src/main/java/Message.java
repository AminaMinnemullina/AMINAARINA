import java.time.format.DateTimeFormatter;

public class Message {
    private User toUser;
    private User fromUser;
    private String text;
    private String date;

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
