import javax.swing.JOptionPane;

public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// Java1.6�H�e �u��� switch (�򥻫��A) case (�򥻫��A)
	switch (Integer.valueOf((JOptionPane.showInputDialog("��J�@ �Ӿ��")))){
	case 1: System.out.print("�A��J���O1");break;
	case 2: System.out.print("�A��J���O2");break;
	default :System.out.print("�A��J�����O1�]���O2");break; 
	}
		
		

	}

}
