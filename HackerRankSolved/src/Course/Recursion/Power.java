package Course.Recursion;

public class Power {

	public static void main(String[] args) {

		int res = getPower(3,0);
		System.out.println("res :: "+res);
	}
	
	public static int getPower(int n,int p) {
		if(p==0) {
			return 1;
		}
		
		return n*getPower(n,p-1);
	}

}
