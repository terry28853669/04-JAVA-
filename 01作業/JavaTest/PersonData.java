import javax.swing.JOptionPane;

public class PersonData {
	
	public static void main(String[] args) {
		
		System.out.print("請輸入姓名:");
		String name =new String();
		int age;
		do{
		name = String.valueOf((JOptionPane.showInputDialog("輸入姓名")));
		age = Integer.valueOf((JOptionPane.showInputDialog("輸入年齡")));
		Person man = new Person(name,age);

	}while(true);

}

class Person{
	String name;
	int age;
		
		public void tell(){
		System.out.println("姓名:"+name+", 年齡"+age);
	}
	public Person(String a,int b){
		name = a;
		
		age  = b;
			
	}
}
