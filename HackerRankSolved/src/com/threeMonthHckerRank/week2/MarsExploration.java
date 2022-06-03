package com.threeMonthHckerRank.week2;

public class MarsExploration {

	public static void main(String[] args) {

		int res = marsExploration("SOSOOSOSOSOSOSSOSOSOSOSOSOS");
		
		System.out.println("res :: "+res);
	}

	public static int marsExploration(String s) {
		
		int sos = s.length()/3;
		int c=0;
		
		String expected = "SOS".repeat(sos);
		
		System.out.println("sos :: "+sos+"      expected :: "+expected);
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=expected.charAt(i)) {
				c++;
			}
		}
		
		return c;
	}
	
//    public static int marsExploration2(String s) {
// 		
//		int sCount=0,oCount=0,other=0;
//		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i) == 'S') {
//				sCount++;
//			}
//			else if(s.charAt(i) == 'O') {
//				oCount++;
//			}
//			else {
//				other++;
//			}
//		}
//		
//		System.out.println("sCount :: "+sCount+"    oCount :: "+oCount+"      other :: "+other);
//		
//		if(oCount*2<sCount)
//			return other;
//		
//		int temp = sCount/2;
//		
//		System.out.println("temp :: "+temp);
//		
//		return -1;
//	}

}





//int sCount=0,oCount=0,other=0;
//
//for(int i=0;i<s.length();i++) {
//	if(s.charAt(i) == 'S') {
//		sCount++;
//	}
//	else if(s.charAt(i) == 'O') {
//		oCount++;
//	}
//	else {
//		other++;
//	}
//}
//
//System.out.println("sCount :: "+sCount+"    oCount :: "+oCount+"      other :: "+other);
//
//if(oCount*2<sCount)
//	return other;
//
//int temp = sCount/2;
//
//System.out.println("temp :: "+temp);
//
//return -1;