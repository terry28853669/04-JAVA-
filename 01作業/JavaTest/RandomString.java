/*
import java.util.Random;

import java.util.Scanner;
public class RandomString {

	/**
	 * @param args
	
	public static void main(String[] args) {
		Random a;
	
		int j=0;
		long b,c=System.currentTimeMillis();
		long d=c;
        for(int i=1;i<=15000;i++){
		    b=System.currentTimeMillis();
		   	if (b!=c) j++;
		   	
		   	System.out.println(b);
		    c=b;   	
        
        }
        System.out.println("j="+j);
        System.out.println("d="+d);
        System.out.println("c-d="+(c-d)+" ns");
	}

}
*/

import java.io.PrintStream;

public class RandomString
{

    public RandomString()
    {
    }

    public static void main(String args[])
    {
        int i = 0;
        long l1 = System.currentTimeMillis();
        long l2 = l1;
        for(int j = 1; j <= 15000; j++)
        {
            long l = System.currentTimeMillis();
            if(l != l1)
                i++;
            System.out.println(l);
            l1 = l;
        }

        System.out.println((new StringBuilder()).append("j=").append(i).toString());
        System.out.println((new StringBuilder()).append("d=").append(l2).toString());
        System.out.println((new StringBuilder()).append("c-d=").append(l1 - l2).append(" ns").toString());
    }
}