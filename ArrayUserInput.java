
import java.util.Scanner;
public class Test{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("intilation of array...");
        System.out.println("Enter"+arr.length+"integer value:");
       
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("****Initiation completed****");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}