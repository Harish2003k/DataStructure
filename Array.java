import java.util.Arrays;
public class arrayString{
    public static void main(String args[]){
       String[] strarr ={"One","Two","Three","Four"};
       System.out.println("Array element are:");
       for(int i=0;i<=strarr.length;i++){
           System.out.println(strarr[i]);
       }
       System.out.println("=====================");
       System.out.println("Printring array element using Arrays.toString():");
       System.out.println("=====================");
       System.out.println(Arrays.toString(strarr));
}
}