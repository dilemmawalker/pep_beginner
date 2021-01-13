import java.util.Scanner;
public class prob8{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for(int i=1;i<=(n/2)+1;i++){
            for(int j=i;j<=(n/2);j++){
                System.out.print("\t");
            }
            int a=i;
            for(int j=1;j<=i;j++){
                System.out.print((a++)+"\t");
            }
            a-=2;
            for(int j=2;j<=i;j++){
                System.out.print((a--)+"\t");
            }
            System.out.println();
        }
        for(int i=(n/2);i>=1;i--){
            for(int j=i;j<=(n/2);j++){
                System.out.print("\t");
            }
            int a=i;
            for(int j=1;j<=i;j++){
                System.out.print((a++)+"\t");
            }
            a-=2;
            for(int j=2;j<=i;j++){
                System.out.print((a--)+"\t");
            }
            System.out.println();
        }
    }
}