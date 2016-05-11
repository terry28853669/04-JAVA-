import java.util.Date;
import java.text.DateFormat;

public class showtime {

	public static void main(String[] args) {
    
	Date a = new Date();
	DateFormat shortF = DateFormat.getDateTimeInstance(3,3);
	
	System.out.println("-------------現在時間-----------------");
	System.out.println(a.hashCode());
	System.out.println(shortF);
	System.out.println(shortF);
	System.out.println(shortF);
	System.out.println(System.currentTimeMillis());
	System.out.println(System.nanoTime());
	System.out.println(shortF.format(a));
	
	}

}
