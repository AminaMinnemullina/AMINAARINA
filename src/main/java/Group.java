public class Group {

    private int id;
    private String name;
    private User[] members;
    private int memberCount;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.members = new User[10];
        this.memberCount = 0; // сначала никого нет
    }

    public void addMember(User user) {
        int number = members.length;
        if (memberCount < number) {
            members[memberCount] = user;
            memberCount++;
        } else { System.out.println("группа полная"); }
    }

    public void removeMember(User user) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i] == user) {
                members[i] = members[memberCount - 1]; //последний теперь присоединившийся
                members[memberCount - 1] = null;
                memberCount--;
                break;
            }
        }
    }
    //новый массив
    public User[] getMembers() {
        User[] currentMembers = new User[memberCount];
        for (int i = 0; i < memberCount; i++) {
            currentMembers[i] = members[i];
        }
        return currentMembers;
    }
}