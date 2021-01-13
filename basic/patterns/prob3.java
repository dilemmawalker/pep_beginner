import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n1=scn.nextInt();
        int n=(n1/2)+1;
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++)
            System.out.print("*\t");
            for(int j=1;j<=a;j++)
            System.out.print("\t");
            for(int j=i;j<=n;j++)
            System.out.print("*\t");
            a+=2;
            System.out.println();
        }
        a-=4;
            for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++)
            System.out.print("*\t");
            for(int j=1;j<=a;j++)
            System.out.print("\t");
            for(int j=1;j<=i;j++)
            System.out.print("*\t");
            a-=2;
            System.out.println();
        }
    }
}