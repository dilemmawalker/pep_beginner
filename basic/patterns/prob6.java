import java.util.Scanner;
public class prob6{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int a=1;
        
        int n=scn.nextInt();
        if(n==1)
        System.out.print(a);
        
        else{
           
           for(int i=0;i<n;i++){
               for(int j=0;j<=i;j++){
                   System.out.print(fact(i,(i-j)>j?i-j:j)+"\t");
               }
               System.out.println();
           }
    }
}
public static int fact(int a,int b){
    int n=1;
    for(int i=a;i>b;i--){
        n*=i;
    }
    for(int i=(a-b);i>=1;i--){
    n/=i;
    }
    return n;
}
}