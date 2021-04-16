package student_class;

public class Students {
	private String fullName;
	private String classs;
	private float c;
	private float php;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public float getPhp() {
		return php;
	}

	public void setPhp(float php) {
		this.php = php;
	}

	public Students(String fullName, String classs, float c, float php) {
		super();
		this.fullName = fullName;
		this.classs = classs;
		this.c = c;
		this.php = php;
	}

	public float getDiemTB(float c, float php) {
		return (c + php) / 2;
	}

	public String getHocLuc(float diemTB) {
		if (diemTB >= 8) {
			return "Giỏi";
		} else if (diemTB >= 6) {
			return "Khá";
		} else if (diemTB >= 5) {
			return "Trung bình";
		} else {
			return "kém";
		}
	}
}
