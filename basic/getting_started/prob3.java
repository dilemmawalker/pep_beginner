import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int n1=(int)Math.sqrt(n);
            int c=0;
            for(int i=1;i<=n1;i++)
            if(n%i==0)
            c++;
            c*=2;
            if(c==2)
            System.out.println("prime");
            else
            System.out.println("not prime");
        }
    }
}