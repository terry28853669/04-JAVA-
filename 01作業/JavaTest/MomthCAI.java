import java.util.*;
public class MomthCAI {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean f =  true;
        Scanner stdIn = new Scanner(System.in);
		String MonthString[] = {"January","Feburary","March","April","May","June","July",
        		                "Auguest","September","October","November","December"};
		int month = (int) (Math.random() *12);
		while(f)
		{System.out.printf("�а�\" "+MonthString[month]+" \" �O�X��!?");
		 int m = stdIn.nextInt();
		 if (m==month+1) {System.out.println("����F!!!"); f= false;}
		 else System.out.println("�����F....");
		}
	}

}
