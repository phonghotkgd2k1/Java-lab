package student_class;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Lab2 {
	
	static ArrayList<Students> listStudent = new ArrayList<Students>();

	public static void main(String[] args) {
		StringBuilder studentBuilder = new StringBuilder();
		float cDiem = 0;
		float phpDiem = 0;
		String sizeInput = JOptionPane.showInputDialog(null, "Nhập số lượng sinh viên cần nhập!");
		int size;
		try {
			size = Integer.parseInt(sizeInput);
			for(int i = 0;i<size;i++) {
				String fullName = JOptionPane.showInputDialog(null, "Nhập tên sinh viên ");
				String classs = JOptionPane.showInputDialog(null, "Nhập lớp");
				String c = JOptionPane.showInputDialog(null, "Nhập điểm C");
				String php = JOptionPane.showInputDialog(null, "Nhập điểm php");
				try {
					cDiem = Float.parseFloat(c);
					phpDiem = Float.parseFloat(php);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Nhập sai kiểu dữ liệu điểm!");
				}
				listStudent.add(new Students(fullName, classs, cDiem, phpDiem));
			}
			
			listStudent.forEach((student) ->{
				String name = student.getFullName();
				String classs = student.getClasss();
				float c = student.getC();
				float php = student.getPhp();
				float diemTB = student.getDiemTB(c, php);
 				studentBuilder.append("Tên: "+name + " Lớp: "+classs+ " Điểm trung bình: " + String.valueOf(diemTB) + " Xếp loại: " + student.getHocLuc(diemTB) + "\n" );
			});
			JOptionPane.showMessageDialog(null, studentBuilder.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Nhập sai số lượng sinh viên!");
		}

	}

}