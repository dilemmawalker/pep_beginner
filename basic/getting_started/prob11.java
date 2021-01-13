import java.io.*;
import java.util.Scanner;
public class prob11{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();

        int n1=Math.max(n,m);
        int m1=Math.min(n,m);
        int rem=n1%m1;
        while(rem!=0){
            int temp=m1;
            m1=n1%m1;
            n1=temp;
            rem=n1%m1;
        }
        System.out.println(m1);
        System.out.println((n*m)/m1);
    }
}