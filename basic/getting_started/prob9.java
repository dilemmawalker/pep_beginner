import java.util.Scanner;
public class prob9{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int n1=n;
        int c1=0;
        while(n1>0){
            c1++;
            n1/=10;
        }
        int[]arr=new int[c1+1];
        int z=arr.length;
        int c=1;
        while(n>0){
            int a=n%10;
            n/=10;
            arr[z-a]=c++;
        }
        for(int i=1;i<arr.length;i++)
        System.out.print(arr[i]);
    }
}