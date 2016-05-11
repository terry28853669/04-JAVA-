class Teacher {
	public String name;
	public int rate;
	public int totalHours;
}

class FullTime extends Teacher {

	public int salary() {
		return (int) (9 * rate + ((totalHours - 9) * rate * 0.8));
	}

	public void print() {
		System.out.println(" �M���Ѯv " + name + " ���~ " + rate + " �`�u�� "
				+ totalHours + " �X�p�~�� :" + salary());
	}

	FullTime(String a, int b, int c) {
		name = a;
		rate = b;
		totalHours = c;
	}
}

class PartTime extends Teacher {
	public int salary() {
		return rate * totalHours;
	}

	PartTime(String a, int b, int c) {
		name = a;
		rate = b;
		totalHours = c;
	}

	public void print() {
		System.out.println(" �ݥ��Ѯv " + name + " ���~ " + rate + " �`�u�� "
				+ totalHours + " �X�p�~�� :" + salary());
	}
}

public class TeacherSalary {
	public static void main(String[] args) {
		PartTime john = new PartTime("John ", 400, 2);
		PartTime mary = new PartTime("Mary ", 300, 4);
		FullTime peter = new FullTime("Peter", 400, 9);
		FullTime pual = new FullTime("Pual ", 300, 12);
		FullTime eric = new FullTime("Eric ", 350, 15);
		john.print();
		mary.print();
		peter.print();
		pual.print();
		eric.print();
	}

}
