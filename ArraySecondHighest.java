public class FindSecondLargestNumber{
    public static void main(string args[]){
        int [] arr1={1,2,3,4,5,6};
        int secondhighest=FindSecondLarge(arr1);
        System.out.println("Second higest number is:"+secondhighest);
    }
    public static int FindSecondLarge(int array[]){
        int highest=Integer.min_value;
        int secondhighest=Integer.min_value;
        for(int i=0;i<array.length;i++){
            if(array[i]>highest){
                secondhighest=highest;
                highest=array[i];
            }
            else if(array[i]>secondhighest && array[i]!=highest)
            secondhighest=array[i];
        }
        return secondhighest;
    }
}