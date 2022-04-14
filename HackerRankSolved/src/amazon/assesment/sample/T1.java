package amazon.assesment.sample;

import java.util.Arrays;
import java.util.List;

public class T1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 13, 4, 11, 9);
		int arraySum = arraySum(list);

		fizzBuzz(15);
	}

	public static void fizzBuzz(int n) 
	{
        for(int i=1;i<=n;i++)
        {
        	if(i%3 ==0 && i%5 ==0)
        	{
        		System.out.println("FizzBuzz");
        	}
        	if(i%3 ==0 && i%5 !=0)
        	{
        		System.out.println("Fizz");
        	}
        	if(i%3 !=0 && i%5 ==0)
        	{
        		System.out.println("Buzz");
        	}
        	if(i%3 !=0 && i%5 !=0)
        	{
        		System.out.println(i);
        	}
        }
	}

	public static int arraySum(List<Integer> numbers) {

		int sum = 0;

		for (int i = 0; i < numbers.size(); i++) {
			sum = sum + numbers.get(i);
		}

		return sum;
	}

}
