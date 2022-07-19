import java.util.*;
public class chocolateDistributionArray {
static int  findMinDiff(int arr[],int n,int m) {
	if(m==0 ||n==0)
		return 0;
	Arrays.sort(arr);
	if(n<m)
		return -1;
	int min_diff=Integer.MAX_VALUE;
	for(int i=0;i+m-1<n;i++) {
		int diff=arr[i+m-1]-arr[i];
		if(diff<min_diff)
			min_diff=diff;
	}
	return min_diff;
	}
public static void main(String args[]) {
	int arr[]= {3,4,1,9,56,7,9,12};
	int m=5;
	int n=arr.length;
	System.out.println("minimum difference is :"+findMinDiff(arr,n,m));
}
}

