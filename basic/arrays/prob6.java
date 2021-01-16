import java.util.Scanner;
public class prob6{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int i=0;
        for( i=0;i<n;i++){
            if(d==arr[i]){
                System.out.println(i);
                break;
            }
        }
        if(i==n)
        System.out.println(-1);
    }
}