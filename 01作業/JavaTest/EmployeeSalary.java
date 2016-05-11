class Employee {
	public String name;
	public int number;
}

class SarlaryWorker extends Employee {

	int yearSalary;

	public void print() {
		System.out.println("���u�s��:"+number+" ���~���u " + name + " �~�~ " + yearSalary + " ���~�� :" + yearSalary/12);
	}

	SarlaryWorker(int a, String b, int c) {
		number=a;
		name = b;
		yearSalary = c;
	}
}

class HourlyWorker extends Employee {
	public int rate;
	public int totalHours;
	public int salary() {
		return rate * totalHours;
	}

	HourlyWorker(int a, String b, int c,int d) {
		number =a;
		name = b;
		rate = c;
		totalHours = d;
	}

	public void print() {
		System.out.println("���u�s��:"+number+" ���~���u " + name + " ���~ " + rate + " �`�u�� "
				+ totalHours + " �X�p�~�� :" + salary());
	}
}

class Manager extends Employee {
	int yearSalary;
	int ���Q ;
	Manager(int a, String b, int c,int d) {
		number=a;
		name = b;
		yearSalary=c;
		���Q =d;
	}

	public void print() {
		System.out.println("���u�s��:"+number+" �g�z        " + name + " �~�~ " + yearSalary + " �C����Q "
				+ ���Q + " ���~�� :"+(yearSalary/12+���Q)) ;
	}
}

public class EmployeeSalary {
	public static void main(String[] args) {
		SarlaryWorker a = new SarlaryWorker(96001,"����~",180000);
		HourlyWorker b =new HourlyWorker(96002,"����~",160,100);
		Manager c =new Manager(97001,"�ο�   ",240000,5000);
	    a.print();
	    b.print();
	    c.print();
	    
	}
	
}
