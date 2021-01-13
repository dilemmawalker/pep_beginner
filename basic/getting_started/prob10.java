import java.util.Scanner;
public class prob10{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int k=scn.nextInt();
        int c=0;
        int n1=n;
        while(n1>0){
            n1/=10;
            c++;
        }
        if(k%c==0)
        k=c;
        else
        k%=c;
        

        if(k<0)
        k+=c;

        if(k>0){
         n1=n%(int)Math.pow(10,k);
         if(n1!=0)
        System.out.print(n1);
        int n2=n/(int)Math.pow(10,k);
        if(n2!=0)
        System.out.print(n2);
        }
    }
}