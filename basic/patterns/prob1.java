import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("\t");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}