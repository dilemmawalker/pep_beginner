import java.util.Scanner;
public class prob10{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i==(n/2)+1){
                for(int j=1;j<=(n/2);j++){
                    System.out.print("*\t");
                }
            }
            else{
                for(int j=1;j<=(n/2);j++){
                    System.out.print("\t");
                }
            }

            if(i<=(n/2)+1){
                for(int j=1;j<=i;j++){
                    System.out.print("*\t");
                }
            }
            else{
                for(int j=i;j<=n;j++){
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}