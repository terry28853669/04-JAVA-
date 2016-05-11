import javax.swing.JOptionPane;

public class StringSplit {
	static String d2="";
	/*------------------ Class under this Line --------------------*/

	/*------------------ Start under this Line --------------------*/
	public static void main(String arg[]) {
		String str = JOptionPane.showInputDialog("請輸入多個E-mail address 並以分號區隔");
		String strArr[] = str.split(";");
		for (String d : strArr) {
			d2 = d2 + d +"\n";			// d=strArr[i]
		}
		JOptionPane.showMessageDialog(null, d2, "你輸入的E-mail為", 1);
	} // end of main()
	/*---------------- Function under this Line ------------------ */

} // end of Class