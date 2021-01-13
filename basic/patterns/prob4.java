import java.util.Scanner;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
}