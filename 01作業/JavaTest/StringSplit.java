import javax.swing.JOptionPane;

public class StringSplit {
	static String d2="";
	/*------------------ Class under this Line --------------------*/

	/*------------------ Start under this Line --------------------*/
	public static void main(String arg[]) {
		String str = JOptionPane.showInputDialog("�п�J�h��E-mail address �åH�����Ϲj");
		String strArr[] = str.split(";");
		for (String d : strArr) {
			d2 = d2 + d +"\n";			// d=strArr[i]
		}
		JOptionPane.showMessageDialog(null, d2, "�A��J��E-mail��", 1);
	} // end of main()
	/*---------------- Function under this Line ------------------ */

} // end of Class