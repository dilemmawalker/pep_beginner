import java.util.Scanner;
import java.util.ArrayList;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=5;
        for(int i=0;i<n;i++)
        System.out.print("*");
        System.out.println();

        for(int i=0;i<3;i++){
            for( int j=i;j<3;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0;i<5;i++)
        System.out.print("*");
    }
}