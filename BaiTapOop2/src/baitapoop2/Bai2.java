package baitapoop2;

import java.util.ArrayList;
import java.util.Collections;

public class Bai2 {
	static ArrayList<Employee> lstWorkers = new ArrayList<Employee>();
    public static void main(String[] args) {
		lstWorkers.add(new Employee("Thành", "Hà Nam", "Hacker" ,0123456, 15000000));
		lstWorkers.add(new Employee("Vinh", "Hà Nam", "Hacker" ,0123456, 1234567890));
		lstWorkers.add(new Employee("Strong", "Hà Nam", "Hacker" ,0123456,123456789));
		lstWorkers.add(new Employee("Hà", "Hà Nam", "Hacker" ,0123456,1234567));
		lstWorkers.add(new Employee("Hưng", "Hà Nam", "Hacker" ,0123456, 98765432));
		lstWorkers.add(new Employee("Đức", "Hà Nam", "Hacker" ,0123456, 7632123));
		lstWorkers.add(new Employee("Nam", "Hà Nam", "Hacker" ,0123456, 45678643));
		
		for(int i = 0;i < lstWorkers.size()-1;i++) {
			for(int j = i+1 ;j<lstWorkers.size();j++) {
				if(lstWorkers.get(i).salary < lstWorkers.get(j).salary) {
					Collections.swap(lstWorkers, i, j);
				}
			}
		}
	//	sapXepTuNhoDenLon();
		
		lstWorkers.forEach((worker) -> {
			System.out.println(worker.toString());
		});

	}
    
    public static void sapXepTuNhoDenLon() {
    	Collections.sort(lstWorkers, (w1,w2) -> w1.salary > w2.salary ? 1 : -1);
    }
}
