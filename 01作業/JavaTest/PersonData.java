import javax.swing.JOptionPane;

public class PersonData {
	
	public static void main(String[] args) {
		
		System.out.print("�п�J�m�W:");
		String name =new String();
		int age;
		do{
		name = String.valueOf((JOptionPane.showInputDialog("��J�m�W")));
		age = Integer.valueOf((JOptionPane.showInputDialog("��J�~��")));
		Person man = new Person(name,age);

	}while(true);

}

class Person{
	String name;
	int age;
		
		public void tell(){
		System.out.println("�m�W:"+name+", �~��"+age);
	}
	public Person(String a,int b){
		name = a;
		
		age  = b;
			
	}
}
