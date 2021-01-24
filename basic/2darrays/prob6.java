import java.util.Scanner;
public class prob6{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int r=scn.nextInt();
        int no=n/2;
        
        for(int i=0;i<no;i++){
            
            if(s==i+1)
            for(int z=0;z<r;z++){
            int[]arr1=new int[n-2*i];
            int[]arr2=new int[n-2*i];
            int[]arr3=new int[n-2*i];
            int[]arr4=new int[n-2*i];

            int ii=0;
            for(int j=i;j<(n-i);j++){
                arr1[ii]=arr[i][j];
                arr3[ii]=arr[n-1-i][j];
                arr2[ii]=arr[j][n-i-1];
                arr4[ii]=arr[j][i];
                ii++;
            }
            ii=0;
            int k=n-(2*i)-1;
            for(int j=i;j<(n-i);j++){
                arr[n-i-1][j]=arr2[k];
                arr[i][j]=arr4[k];
                arr[j][n-i-1]=arr1[ii];
                arr[j][i]=arr3[ii];
                ii++;
                k--;
            }
        }}
        display(arr);
    }
    public static void display(int[][]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}