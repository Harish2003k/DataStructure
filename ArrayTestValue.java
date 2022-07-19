import java.util.*;
public class ArrayTestValue {
	public static boolean contain(int arr[],int item) {
		for(int n: arr){
		if(item==n) {
			return true;
		}
		}  /// wheather element present or not
		return false;
	}
	public static void main(String args[]) {
		int arr[]= {2014,2015,2013,2016,2017,2018,2019};
		System.out.println(contain(arr,2013));
		System.out.println(contain(arr,2022));
	}

}
