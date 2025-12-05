public class User {

    private String name;
    private String id;
    private Message[] messages;
    private int messageCount;

    public User(String name, String id){
        this.name = name;
        this.id = id;
        this.messages = new Message[1000];
    }

    public String getName(){
        return name;
    }

    public String getId() {
        return id;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void sendMessage(User toUser, String text, String date, String time){
        Message message = new Message(this, toUser, text, time, date);
        if (messageCount < messages.length) {
            messages[messageCount] = message;
            messageCount++;
        } else {
            System.out.println("Массив сообщение для " + name + " переполнен");
        }
        toUser.receiveMessage(message);
    }


    public void sendGroupMessage(Group group, String text, String date, String time) {
        Message message = new Message(this, null, text, time, date);
        group.addMessage(message);
    }


    public void sendChannelMessage(Channel channel, String text, String date, String time) {
        if (channel.getCreator() != this) {
            System.out.println("Только создатель канала имеет право отправлять сообщения.");
            return;
        }
        Message message = new Message(this, null, text, time, date);
        channel.addMessage(message);
    }

    public void receiveMessage(Message message) {
        if (messageCount < messages.length) {
            messages[messageCount] = message;
            messageCount++;
        }
    }

    @Override
    public String toString() {
        return ("Имя: " + getName() + ", ID: " + getId());

    }

    public Message[] getMessages() {
        return messages;
    }
}
