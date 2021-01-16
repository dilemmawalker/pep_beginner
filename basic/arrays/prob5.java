import java.util.Scanner;
public class prob5{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        System.out.println(max-min);
    }
}