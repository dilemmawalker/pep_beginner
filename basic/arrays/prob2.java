import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int b=scn.nextInt();

            int c=0;
            int cc=0;
            while(n>0){
                int a=n%10;
                n/=10;
                c+=a*(int)Math.pow(b,cc++);
            }
            System.out.print(c);
    }
}