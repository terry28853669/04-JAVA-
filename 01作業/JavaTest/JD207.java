
public class JD207 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�{������ɰѼ� �]�p
		if(args.length==0) return;
		if(args.length>1) return;
		if(args[0].equals("-help")) System.out.println(" Help !" );
		if(args[0].equals("-admin")) System.out.println(" Admin mord !" );
		if(args[0].equals("-root")) System.out.println(" Root mord !" );
	}

}
