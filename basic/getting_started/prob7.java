import java.util.Scanner;
public class prob7{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        long n=0l;
         n=scn.nextLong();
        long n1=0l;
        n1=n;
        long n2=0l;
        int c=0;
        while(n1>0){
            long a=n1%10;
            n2=(n2*10)+a;
            n1/=10;
            c++;
        }
        while(n2>0){
           c--;
            System.out.println(n2%10);
            n2/=10;
        }
        while(c-->0)
        System.out.println("0");
    }
}