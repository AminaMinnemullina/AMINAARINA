public class Message {
    private User toUser;
    private User fromUser;
    private String message;
    private String date;
    private String time;
    private String receiver;

    public Message(User fromUser, User toUser, String message, String time, String date) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.message = message;
        this.time = time;
        this.date = date;
        if (toUser != null){
            this.receiver = toUser.getName();
        } else {
            this.receiver = "Участники";
        }
    }

    public String getMessage() {
        return message;
    }

    public User getFrom() {
        return fromUser;
    }

    public User getTo() {
        return toUser;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "от: " + fromUser.getName() +
                " кому: " + receiver +
                " текст: " + message +
                " дата: " + date +
                " время: " + time;
    }
}
