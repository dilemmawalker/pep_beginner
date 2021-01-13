import java.util.Scanner;
public class prob6{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        long n=0l;
         n=scn.nextLong();
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        System.out.println(c);
    }
}