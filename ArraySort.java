import java.util.Arrays;
public class SortArrays {
public static void main (String args[]){
    int arr1[]= {50,70,80,90};
    System.out.println("Before sorting :"+Arrays.toString(arr1));
    Arrays.sort(arr1);
    System.out.println("After sorting :"+Arrays.toString(arr1));
}
}
