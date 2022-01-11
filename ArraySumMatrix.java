public class SumOfArray{
public static void main(String args[]){
    int a[][]={{1,2,3},{1,2,3},{1,2,3}}; // Creating two  matrix 
    int b[][]={{2,3,4},{2,3,4},{2,3,4}};
    int sum[]= new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            sum[i][j]=a[i][j]+b[i][j];
            System.out.print(sum[i][j]+"");
        }
        System.out.println();
    }
}
}