import java.util.Scanner;
public class SearchArray{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number of element:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Input the array element:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                System.out.println("......Element found:....");
            }
        }
    }
}