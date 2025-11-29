public class Group {

    private String id;
    private String name;
    private User[] members;
    private int memberCount;
    private Message[] messages;

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
        this.members = new User[10];
        this.memberCount = 0;
        this.messages = new Message[0];
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

    // новый массив
    public User[] getMembers() {
        User[] currentMembers = new User[memberCount];
        for (int i = 0; i < memberCount; i++) {
            currentMembers[i] = members[i];
        }
        return currentMembers;
    }
    public void printMembers() {
        System.out.println("Количество участников: " + memberCount);
        for (int i = 0; i < memberCount; i++) {
            System.out.print(members[i] + ", ");
        }
        System.out.println();
    }
    public void printMessages() {
        for (int i = 0; i < messages.length; i++) {
            Message message = messages[i];
            System.out.println(message.fromUser() + ", " + message.toUser() + ": " + message.text());
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // инфа о группе
    public class Info {
        private StringBuilder stringBuilder;//класс для аппенда

        public Info() {
            stringBuilder = new StringBuilder();
        }

        public Info append(String str) {
            stringBuilder.append(str);
            return this;
        }

        @Override
        public String toString() {
            return stringBuilder.toString();
        }
    }
}
