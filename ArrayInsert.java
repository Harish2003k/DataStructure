import java.util.Scanner;
public class InsertElement{
    public static void main(String args[]){
        int n, pos,x;
        System.out.println("Enter the number of elemnet you want in array:");
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        int a[] =new int [n+1];
        System.out.println("Enter all the element:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the position of element where want to be insert:");
        pos=sc.nextInt();
        System.out.println("Enter the element you want to insert:");
        x=sc.nextInt();
        for(int i=(n-1);i>=(pos-1);i--){
            a[i+1]=a[i];
        }
        a[pos-1]=x;
        System.out.println("After inserting:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+",");
        }
        System.out.println(a[n]);
    }
}