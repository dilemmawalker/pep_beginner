import  java.util.Scanner;
public class prob7{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int max=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
            max=Math.max(max,a);
        }
        for(int i=max;i>=1;i--){
            for(int j=0;j<n;j++){
                int a=arr[j];
                if(a>=i)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}