public class StringtoHex {
	// �N��J���r���ରUnicode 16�i�� �� Big5 16�i��
	public static void main(String[] args) {
		String str = "Java�r���ഫ";
		String str1 = toHex(str);
        System.out.println(str1);
	}

	public static String toHex(String s) {
    String temp="";
    for(int i=0;i<=s.length()-1;i++){
     char c=s.charAt(i);
     String temp2="00"+Integer.toHexString(c);	
     temp += temp2.substring(temp2.length()-4)+" " ;	
    }
 		return temp;
	}
}