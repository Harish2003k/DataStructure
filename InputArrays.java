import java.util.*;
public class InputArrays {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();  // only we have enter the size not any value so java have default value is 0 for int.
		int number[]=new int [size]; // float  value is 0.0 and string have ""
		for(int i=0;i<size;i++) {
			System.out.println(number[i]);
		}
	}

}
