import java.util.Scanner;
public class prob12{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int a=(int)Math.sqrt(n);
        int n1=n;
        for(int  i=2;i<=n1 && n>1;i++){
            if(n%i==0 && n>1){
                while(n%i==0 && n>1){
                    System.out.print(i+" ");
                    n/=i;
                }
            }
        }
    }
}