public class Channel {

    private String id;
    private String name;
    private String description;
    private User[] members;
    private int memberCount;

    public Channel(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.members = new User[10];
        this.memberCount = 0;
    }

    public void addMember(User user) {
        int number = members.length;
        if (memberCount < number) {
            members[memberCount] = user;
            memberCount++;
        } else {
            System.out.println("Канал полон");
        }
    }

    public void removeMember(User user) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].equals(user)) {
                for (int j = i; j < memberCount - 1; j++) {
                    members[j] = members[j + 1];
                }
                members[memberCount - 1] = null;
                memberCount--;
                return;
            }
        }
        System.out.println("Участник не найден");
    }

    public User[] getMembers() {
        User[] currentMembers = new User[memberCount];
        for (int i = 0; i < memberCount; i++) {
            currentMembers[i] = members[i];
        }
        return currentMembers;
    }
}

