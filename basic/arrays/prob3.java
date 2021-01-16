import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        long n=0l;
        n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        int c=0;
        int z=0;
        while(n>0){
            int a=(int)n%10;
            n/=10;
            c+=a*(int)Math.pow(b1,z++);
        }
        String ans="";
        while(c>0){
            int a=c%b2;
            c/=b2;
            ans=a+ans;
        }
        System.out.println(ans);
    }
}