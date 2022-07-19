import java.util.*;
public class AverageArray {
	public static void main(String args[]) {
		int number[]= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<number.length;i++) {
			sum=sum+i;
		}
		System.out.println("sum of number is :"+sum);
		int average;
		average=sum/number.length;
		System.out.println("Average of number is:"+average);
	}

}
