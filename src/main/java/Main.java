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

        System.out.println();

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
                System.out.println();
            }
        }

        Group group1 = new Group("503", "Легендарная 11-503", users[1]);
        group1.addMember(users[0]);
        group1.addMember(users[2]);
        group1.addMember(users[3]);

        System.out.println();

        System.out.println("Участники группы "+ group1.getName() + ":");
        for (int i = 0; i < group1.getMemberCount(); i++) {
            System.out.println(group1.getMembers()[i].getName());
        }

        System.out.println("Количество участников: " + group1.getMemberCount());

        users[1].sendGroupMessage(group1, "Пока, Аминка)", "5.12.26", "12:52");
        group1.removeMember(users[0]);

        System.out.println("Сообщения группы "+ group1.getName()+ ":");
        for (int i = 0; i < group1.getMessageCount(); i++){
            System.out.println(group1.getMessages()[i]);
        }

        System.out.println("Участники группы "+ group1.getName() + ":");
        for (int i = 0; i < group1.getMemberCount(); i++) {
            System.out.println(group1.getMembers()[i].getName());
        }
        System.out.println("Количество участников: " + group1.getMemberCount());

        System.out.println();

        Channel travelBlog = new Channel("111", "Амина-путешественница", users[0]);
        travelBlog.addSubscriber(users[1]);
        travelBlog.addSubscriber(users[3]);


        System.out.println("Подписчики, канала "+ travelBlog.getName() + ":");
        for (int i = 0; i < travelBlog.getSubscriberCountCount(); i++) {
            System.out.println(travelBlog.getSubscribers()[i].getName());
        }

        System.out.println("Количество подписчиков, канала "+ travelBlog.getName() + ": " + travelBlog.getSubscriberCountCount());

        System.out.println();

        users[0].sendChannelMessage(travelBlog, "ВСЕМ ПРИВЕТ! Я СНИМАЮ " +
                "\nРАЗВЛЕКАТЕЛЬНЫЙ КОНТЕНТ ПРО ПУТЕШЕСТВИЯ! НЕ ЗАБУДЬТЕ ПОДПИСАТЬСЯ, " +
                "\nПОСТАВИТЬ ЛАЙК И НАПИСАТЬ КОММЕНТАРИЙ :)","13.12.23", "10:12");
        users[0].sendChannelMessage(travelBlog, "Ребята! Завтра я лечу в Геленджик, УРАА," +
                " \nждите много новых постов в канал", "14.07.25", "15:43");
        users[0].sendChannelMessage(travelBlog, "Дорогие подписчики, я приехала в Геленджик!" +
                "\nНо даже на отдыхе я не забываю делать домашку по иип! Потому что ведёт её " +
                "\nмой любимый преподаватель - Еникеев Камиль Шамилевич!", "15.07.25", "12:45");

        System.out.println("Сообщения канала "+ travelBlog.getName()+ ":");
        for (int i = 0; i < travelBlog.getMessageCount(); i++){
            System.out.println(travelBlog.getMessages()[i]);
        }
    }
}

