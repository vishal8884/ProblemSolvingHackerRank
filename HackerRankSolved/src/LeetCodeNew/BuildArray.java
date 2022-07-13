package LeetCodeNew;

import java.util.Arrays;

public class BuildArray {

	public static void main(String[] args) {

		int[] arr = { 1,2,1 };
		int[] res = getConcatenation(arr);
		System.out.println("res :: "+Arrays.toString(res));
	}

	public static int[] buildArray(int[] nums) {

		int[] res = new int[nums.length];

		for (int i = 0; i < res.length; i++) {
			res[i] = nums[nums[i]];
		}

		return res;
	}

	public static int[] getConcatenation(int[] nums) {

		int[] res = new int[nums.length*2];
        int x=0;
		
		for (int i = 0; i < nums.length; i++) {
			res[x] = nums[i];
			x++;
		}
		for (int i = 0; i < nums.length; i++) {
			res[x] = nums[i];
			x++;
		}

		return res;
		
	}

}
