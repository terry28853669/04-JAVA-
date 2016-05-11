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
		{System.out.printf("請問\" "+MonthString[month]+" \" 是幾月!?");
		 int m = stdIn.nextInt();
		 if (m==month+1) {System.out.println("答對了!!!"); f= false;}
		 else System.out.println("答錯了....");
		}
	}

}
