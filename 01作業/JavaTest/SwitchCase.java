import javax.swing.JOptionPane;

public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// Java1.6以前 只能用 switch (基本型態) case (基本型態)
	switch (Integer.valueOf((JOptionPane.showInputDialog("輸入一 個整數")))){
	case 1: System.out.print("你輸入的是1");break;
	case 2: System.out.print("你輸入的是2");break;
	default :System.out.print("你輸入的不是1也不是2");break; 
	}
		
		

	}

}
