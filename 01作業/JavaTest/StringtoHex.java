public class StringtoHex {
	// 將輸入的字串轉為Unicode 16進位 跟 Big5 16進位
	public static void main(String[] args) {
		String str = "Java字串轉換";
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