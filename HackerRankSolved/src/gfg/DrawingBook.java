package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrawingBook {

	public static void main(String[] args) {

		int res = pageCount(15, 8);
		System.out.println("res :: "+res);
	}

	public static int pageCount(int n, int p) {
		// Write your code here
		List<int[]> book = new ArrayList<>();
		int no_of_turns_front=0;
		int c=0;
		int no_of_turns_back=0;

		int plen = n/2+1;
		boolean isEven = n%2==0?true:false;
		int a=0,b=1;
		
		for(int i=0;i<plen;i++) {
			if(isEven && i==plen-1) {
				b=0;
			}
			int[] pages = {a,b};
			a=a+2;
			b=b+2;
			
			if(pages[0]==p || pages[1]==p) {
				no_of_turns_front=i;
			}
			
			System.out.println("pages :: "+Arrays.toString(pages));
			book.add(pages);
		}

		
		for(int i=book.size()-1;i>=0;i--) {
			if(book.get(i)[0]==p || book.get(i)[1]==p) {
				no_of_turns_back=c;
				break;
			}
			c++;
		}
		
		System.out.println("no_of_turns :: "+no_of_turns_front+"     no of turn back :: "+no_of_turns_back);
		
		return Math.min(no_of_turns_front, no_of_turns_back);
	}
}
