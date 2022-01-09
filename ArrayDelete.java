import java.util.Scanner;
public class DeleteElement{
    public static void main(String args[]){
        int n,x,count=1,loc=0;
        System.out.println("Enter the number of element:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[] =new int[n];
        System.out.println("Input the array element:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to delete:");
        x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==x){
                count=1;
                loc=i;
                break;
            }
            else{
                count=0;
            }
        }
        if(count==1){
            for(int i=loc+1;i<n;i++){
                a[i-1]= a[i];
            }
            System.out.println("After deleting element:");
            for(int i=0;i<n-2;i++){
                System.out.println(a[i]+" ,");
            }
            System.out.println(a[n-2]);
        }
        else{
            System.out.println("Element not found......");
        }
    }
}