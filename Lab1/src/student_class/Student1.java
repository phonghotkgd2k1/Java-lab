package student_class;

import javax.swing.JOptionPane;

public class Student1 {
	String firstName;
	String lastName;
	int age;

	public Student1(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Student1() {
	}

	public static void main(String[] args) {
		String last = JOptionPane.showInputDialog(null, "Nhập last name: ");
		String first = JOptionPane.showInputDialog(null, "Nhập first name: ");
		String age = JOptionPane.showInputDialog(null, "Nhập age: ");
		try {
			int tuoiInt = Integer.parseInt(age);
			Student1 student = new Student1(first, last, tuoiInt);
			chao(student);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Bạn nhập sai kiểu dữ liệu tuổi!", "Lỗi", JOptionPane.WARNING_MESSAGE);
		}

	}
	
	public static void chao(Student1 student) {
		JOptionPane.showMessageDialog(null, "Xin chào " + student.lastName + " " + student.firstName + ", "
				+ String.valueOf(student.age) + " tuổi", "Xin chào", JOptionPane.INFORMATION_MESSAGE);
	}
}
