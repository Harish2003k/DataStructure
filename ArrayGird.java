import java.util.*;
public class ArrayGird {
	public static void main(String args[]) {
		int [][]a=new int [10][10];
		for(int i=1;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%d",a[i][j]);
			}
			System.out.println();
		}
	}

}
