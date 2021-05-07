package baitapoop2;

public class Manager {
	String name;
    String address;
    String phoneNumber;
    int teamSize;

    public Manager(String name, String address, String phoneNumber, int teamSize) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.teamSize = teamSize;
    }
    
    public void work() {
        System.out.println("I am a manager, i manage team of " + teamSize);
    }
}
