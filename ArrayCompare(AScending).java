import java.util.Arrays;
public class CompareArray{
    public static void main(String args[]){
        int arr1[]={50,44,34,23};
        Arrays.parallelSort(arr1);
        System.out.println("Compare Array"+Arrays.toString(arr1));
    }
}