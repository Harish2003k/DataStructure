import java.util.Scanner;
public class InputArrayAndPrintNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt(); 
		int number[]=new int [size]; 
		for(int i=0;i<size;i++) { // this is used to  taking input  from user ,of number in arrays
			number[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {  // this loop help to print each and every element in arrays..
			System.out.println(number[i]);
		}
	}

}
