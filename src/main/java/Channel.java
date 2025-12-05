public class Channel {

    private String id;
    private String name;
    private User[] subscribers;
    private User creator;
    private int subscriberCount;
    private Message[] channelMessages = new Message[100000];
    private int messageCount = 0;

    public Channel(String id, String name, User creator) {
        this.id = id;
        this.name = name;
        this.subscribers = new User[10];
        this.creator = creator;
        this.subscribers[0] = creator;
        this.subscriberCount = 1;
    }

    public void addSubscriber(User user) {
        int number = subscribers.length;
        if (subscriberCount < number) {
            subscribers[subscriberCount] = user;
            subscriberCount++;
        } else {
            System.out.println("Канал полон");
        }
    }
    public void removeSubscriber(User user) {
        for (int i = 0; i < subscriberCount; i++) {
            if (subscribers[i].equals(user)) {
                subscribers[i] = subscribers[subscriberCount - 1];
                subscribers[subscriberCount - 1] = null;
                subscriberCount--;
                break;
            }
        }
    }

    public User[] getSubscribers() {
        User[] currentSubscribers = new User[subscriberCount];
        for (int i = 0; i < subscriberCount; i++) {
            currentSubscribers[i] = subscribers[i];
        }
        return currentSubscribers;
    }
    public void addMessage(Message message) {
        if (messageCount < channelMessages.length) {
            channelMessages[messageCount] = message;
            messageCount++;
        }
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Message[] getMessages() {
        return channelMessages;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public User getCreator() {
        return creator;
    }

    public int getSubscriberCountCount() {
        return subscriberCount;
    }
}

