import java.util.List;
import java.util.ArrayList;
public class Main {
    private static final List<Message> messages = new ArrayList<>();
    public static void main(String[] args) {

        User[] users = new User[4];
        users[0] = new User("Амина", "666");
        users[1] = new User("Арина", "007");
        users[2] = new User("Богдаша", "123");
        users[3] = new User("Айгизя", "456");

        sendMessage(users[0], users[1], "Привет!");
        sendMessage(users[2], users[3], "Как дела?");
        sendMessage(users[1], users[0], "Что задали по проге?");

        System.out.println("Пользователи: ");
        for (User user : users) {
            System.out.println(user.toString());

        }
    }

    public static void sendMessage(User fromUser, User toUser, String text) {
        Message message = new Message(fromUser, toUser, text);
        messages.add(message);
    }
}

