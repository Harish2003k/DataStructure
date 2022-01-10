
public class Compare{
    public static void main(String args[]){
        int arr1[]={12,1,2,3,4,5};
        int arr2[]=arr1;
        int arr3[]={12,1,2,3,4,5};
        int arr4[]={2,3,45,5,6};
        if(arr1==arr2)
        System.out.println("arr1 and arr2 are same:");
        else
        System.out.println("Arr1 and arr2 not same:");
        if(arr1==arr3)
        System.out.println("arr1 and arr3 are same:");
        else
        System.out.println("arr1and arr3are not same:");
        if(arr1==arr4)
        System.out.println("arr1 and arr4 are same:");
        else
        System.out.println("arr1 and arr4 are not same:");
        
    }
}