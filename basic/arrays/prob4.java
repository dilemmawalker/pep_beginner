import java.util.Scanner;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int c1=0,c2=0,c=0;
        int z=0;
        while(n1>0){
            int a=(int)n1%10;
            n1/=10;
            c1+=a*(int)Math.pow(b,z++);
        }
        z=0;
        while(n2>0){
            int a=(int)n2%10;
            n2/=10;
            c2+=a*(int)Math.pow(b,z++);
        }
        c+=c2*c1;
        String ans="";
        while(c>0){
            int a=c%b;
            c/=b;
            ans=a+ans;
        }
        System.out.println(ans);
    }
}