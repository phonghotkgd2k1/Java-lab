package baitapoop2;

public class Programmer {
	String name;
    String address;
    String phoneNumber;
    String[] programmingLanguages;

    public Programmer(String name, String address, String phoneNumber, String[] programmingLanguages) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.programmingLanguages = programmingLanguages;
    }
    
    
    
    public void work() {
        System.out.println("I am a programmer, i code...");
    }
}
