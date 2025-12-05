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

    public void receiveMessage(Message message) {
        if (messageCount < messages.length) {
            messages[messageCount] = message;
            messageCount++;
        }
    }


    public Message[] getMessages() {
        return messages;
    }
}
