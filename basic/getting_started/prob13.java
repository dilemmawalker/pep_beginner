import java.util.Scanner;
public class prob13{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int sum=a+b+c;

        long n1=Math.max(a,Math.max(b,c));
        long n3=Math.min(a,Math.min(b,c));
        long n2=sum-(n1+n3);

        if((n1*n1)==(n2*n2 + n3*n3))
        System.out.println("true");
        else
        System.out.println("false");
    }
}