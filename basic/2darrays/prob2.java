import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]arr1=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        int[][]arr2=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                arr2[i][j]=scn.nextInt();
            }
        }
        if(m==n1){
            int[][]arr=new int[n][m1];
            for(int i=0;i<n;i++){
               for(int k=0;k<m1;k++){ 
                   int c=0;
                   for(int j=0;j<m;j++){
                    c+=(arr1[i][j]*arr2[j][k]);
                }
                arr[i][k]=c;
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}