import java.util.*;
public class kadaneArray {
	  // maximum sum of contiguous of sub arrays
	public static void main(String args[]) {
		int []a= {-2,-1,4,5,-1,2,1,-3};
		System.out.println("Maximum sum:"+maxsubarraysum(a));
	}
		static int maxsubarraysum(int a[]) {
		int size=a.length;
		int max_so_far=Integer.MIN_VALUE,max_ending_here=0;
		for(int i=0;i<size;i++) {
			max_ending_here=max_ending_here+a[i];
			if(max_so_far<max_ending_here)
				max_so_far=max_ending_here;
			if(max_ending_here<0)
				max_ending_here=0;
		}
		return max_so_far;
		
		}
		
}