import java.util.*;
public class TwoDArrays {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of column:");
		int cols=sc.nextInt();
		int [][] numbers=new int [rows][cols];
		// input the arrays
		System.out.println("Element of rows and colume is:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		// output of arrays input 
		System.out.println("Elemnt that you enter is:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

}
