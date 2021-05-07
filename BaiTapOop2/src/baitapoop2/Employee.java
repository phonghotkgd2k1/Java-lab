package baitapoop2;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
	    String ten,diachi,work;
	    int phoneNumber;
	    float salary;

	    public Employee(String ten, String diachi, String work, int phoneNumber, float salary) {
	        this.ten = ten;
	        this.diachi = diachi;
	        this.work = work;
	        this.phoneNumber = phoneNumber;
	        this.salary = salary;
	    }

		@Override
		public String toString() {
			return "Employee [ten=" + ten + ", diachi=" + diachi + ", work=" + work + ", phoneNumber=" + phoneNumber
					+ ", salary=" + currencyVN.format(salary) + "]";
		}
	    

	    
	}
	
