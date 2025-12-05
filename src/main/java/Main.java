public class Main {
    public static void main(String[] args) {

        User[] users = new User[4];
        users[0] = new User("Амина", "666");
        users[1] = new User("Арина", "007");
        users[2] = new User("Богдаша", "123");
        users[3] = new User("Айгизя", "456");

        users[0].sendMessage(users[1], "Приветик! Как дела?", "27.10.25", "10:03");
        users[1].sendMessage(users[0], "Привет, хорошо. Ты как?", "27.10.25", "10:06");
        users[3].sendMessage(users[0], "Ты посмотрела новые серии осд?", "31.11.25", "19:27");
        users[2].sendMessage(users[3], "Привет, что задали по иип?", "6.12.25", "14:12");


        System.out.println("Пользователи: ");
        for (User user : users) {
            System.out.println(user.toString());

        }

        for (int i = 0; i < users.length; i++) {
            Message[] userMessages = users[i].getMessages();
            int messageCount = users[i].getMessageCount();

            if (messageCount > 0) {
                System.out.println("ЛС пользователя " + users[i].getName() + ":");

                for (int j = 0; j < messageCount; j++) {
                    if (userMessages[j] != null) {
                    System.out.println(userMessages[j]);
                    }
                }
            }
        }
    }
}

