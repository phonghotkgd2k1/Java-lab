package baitapoop2;

public class Main {
	  public static void main(String[] args) {
	        
	        Programmer p1 = new Programmer("John", "Address 1", "phone 1", new String[] {"Java", "PHP"});
	        p1.work();
	        
	        Manager m1 = new Manager("Mike", "Address 2", "phone 2", 3);
	        m1.work();
	    }
}
