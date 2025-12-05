public class Group {

    private String id;
    private String name;
    private User[] members;
    private User admin;
    private int memberCount;
    private Message[] groupMessages = new Message[100000];
    private int messageCount = 0;

    public Group(String id, String name, User admin) {
        this.id = id;
        this.name = name;
        this.members = new User[10];
        this.admin = admin;
        this.members[0] = admin;//админ будет высвечиваться первым
        this.memberCount = 0;
    }

    public void addMember(User user) {
        if (memberCount < members.length) {
            members[memberCount] = user;
            memberCount++;
        } else {
            System.out.println("Группа полная");
        }
    }

    public void removeMember(User user) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i] == user) {
                members[i] = members[memberCount - 1]; // последний вместо удаленного
                members[memberCount - 1] = null;
                memberCount--;
                break;
            }
        }
    }

    public User[] getMembers() {
        User[] currentMembers = new User[memberCount];
        for (int i = 0; i < memberCount; i++) {
            currentMembers[i] = members[i];
        }
        return currentMembers;
    }

    public void addMessage(Message message) {
        if (messageCount < groupMessages.length) {
            groupMessages[messageCount] = message;
            messageCount++;
        }
    }

    public String getName() {
        return name;
    }

    public Message[] getMessages() {
        return groupMessages;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public User getAdmin() {
        return admin;
    }

    public User[] members(){
        return members;
    }
}
