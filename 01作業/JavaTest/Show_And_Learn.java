/*===============================================================================
Class 厩策 Java Method 代刚祘Α
ㄏノ盢祘Α絏 Function て
ッ玂痙 暗厩策魁

=================================================================================*/

public class Show_And_Learn {
	// 箇砞办跑计
	static boolean z1, z2, z3, z4, z5;
	static char c1, c2, c3, c4, c5;
	static byte b1, b2, b3, b4, b5;
	static short s1, s2, s3, s4, s5;
	static int i1, i2, i3, i4, i5;
	static long l1, l2, l3, l4, l5;
	static float f1, f2, f3, f4, f5;
	static double d1, d2, d3, d4, d5;

	/*------------------ Class under this Line --------------------*/
	public class Map2D {
		int x = 800;
		int y = 600;
		int map[][];

		public Map2D(int a, int b) {
			x = a;
			y = b;
		}
	}

	/* ################# Start under this Line #################### */
	public static void main(String arg[]) {
		//祘Α磅︽把计 砞璸
		/*		if(args.length==0) return;
				if(args.length>1) return;
				if(args[0].equals("-help")) System.out.println(" Help !" );
				if(args[0].equals("-admin")) System.out.println(" Admin mord !" );
				if(args[0].equals("-root")) System.out.println(" Root mord !" ); */
		
		
		
		
		
	} // End of Main()

	/* ################# Function under this Line ################## */

	// Show Nano() 
	public static void Nano() {
		System.out.println(" " + System.nanoTime());
	}
	public static int Nano(int a) {
		switch (a) {
		case 0:
			return 0; // Nano(0) 耴箂
		case 1:
			return (int)System.nanoTime(); // Nano(1) 穝
		default:
			System.out.println("Nano把计岿粇");
			return (Integer) null;}
		}
	public static long Nano(long a) {
		switch ((int)a) {
		case 0:
			return 0; // Nano(0) 耴箂
		case 1:
			return System.nanoTime(); // Nano(1) 穝
		default:
			System.out.println("Nano把计岿粇");
			return (Long) null ;
		}
	}

} // End of Show_And_Learn Class