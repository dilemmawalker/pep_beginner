import java .util.Scanner;
public class prob13{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int a=1;
        if(n==1)
        System.out.print("*");
        else
        for(int i=1;i<=n;i++){
            if(i<=(n/2)){
                System.out.print("*\t");
                for(int j=3;j<=n;j++){
                    System.out.print("\t");
                }
                System.out.println("*\t");
            }
            else{
                System.out.print("*\t");
                if(i==(n/2)+1){
                    for(int j=i;j<n-1;j++){
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    for(int j=i;j<n-1;j++){
                        System.out.print("\t");
                    }   
                    System.out.print("*\t");
                }
                else if(i==n){
                    for(int j=3;j<=n;j++){
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    
                    
                }
                else{
                    for(int j=i;j<n-1;j++){
                        System.out.print("\t");
                    }
                    System.out.print("*\t");

                    for(int  j=1;j<=a;j++){
                        System.out.print("\t");
                    }

                    System.out.print("*\t");
                    a+=2;

                    for(int j=i;j<n-1;j++){
                        System.out.print("\t");
                    }   
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}