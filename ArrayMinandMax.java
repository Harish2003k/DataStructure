import java.util.Arrays;
import java.util.Collections;
public class Test{
    public static void main(String args[]){
        int[] num ={1,2,3,4,5,6};
        int min =Collections.min(Arrays.asList(num)); // to find min number
        int max =Collections.max(Arrays.asList(num)); // to find max number
        System.out.println("Minmum number of arrays:"+min);
        System.out.println("Maxmium number of array:"+max);
    }
}