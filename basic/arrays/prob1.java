import java.util.Scanner;
public  class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int b=scn.nextInt();
        String ans="";
        while(n>0){
            int a=n%b;
            n/=b;
            ans=a+ans;
        }
        System.out.print(ans);
    }
}