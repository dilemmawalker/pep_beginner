import java.util.Scanner;
public class prob10{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
        }
       int k=scn.nextInt();
       k%=n;
       if(k<0)
       k+=n;
       
        k=n-k;
       for(int i=k;i<n;i++){
           System.out.print(arr[i]+" ");
       }
       for(int i=0;i<k;i++){
        System.out.print(arr[i]+" ");
       }
    }
}