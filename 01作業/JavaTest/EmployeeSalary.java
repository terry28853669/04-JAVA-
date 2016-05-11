class Employee {
	public String name;
	public int number;
}

class SarlaryWorker extends Employee {

	int yearSalary;

	public void print() {
		System.out.println("員工編號:"+number+" 月薪員工 " + name + " 年薪 " + yearSalary + " 月薪資 :" + yearSalary/12);
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
		System.out.println("員工編號:"+number+" 時薪員工 " + name + " 時薪 " + rate + " 總工時 "
				+ totalHours + " 合計薪資 :" + salary());
	}
}

class Manager extends Employee {
	int yearSalary;
	int 紅利 ;
	Manager(int a, String b, int c,int d) {
		number=a;
		name = b;
		yearSalary=c;
		紅利 =d;
	}

	public void print() {
		System.out.println("員工編號:"+number+" 經理        " + name + " 年薪 " + yearSalary + " 每月紅利 "
				+ 紅利 + " 月薪資 :"+(yearSalary/12+紅利)) ;
	}
}

public class EmployeeSalary {
	public static void main(String[] args) {
		SarlaryWorker a = new SarlaryWorker(96001,"領月薪",180000);
		HourlyWorker b =new HourlyWorker(96002,"算時薪",160,100);
		Manager c =new Manager(97001,"肥貓   ",240000,5000);
	    a.print();
	    b.print();
	    c.print();
	    
	}
	
}
