import java.util.Scanner;
public class prob5{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int a=0;    
        int b=1;
        int c=0;
        int n=scn.nextInt();
        if(n==1){
        System.out.print(a);
        
        }
        else{n-=2;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }}
    }
}
