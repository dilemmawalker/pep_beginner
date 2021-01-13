import java.util.Scanner;
public class prob12{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i<=((n/2)+1)){
                if(i==1){
                    for(int j=1;j<=(n/2)+1;j++){
                        System.out.print("*\t");
                    }
                    for(int j=(n/2)+2;j<n;j++){
                        System.out.print("\t");
                    }
                    System.out.println("*");
                }
                else if(i==((n/2)+1)){
                    for(int j=1;j<=n;j++){
                        System.out.print("*\t");
                    }
                    System.out.println();
                }
                else{
                    for(int j=1;j<=(n/2);j++){
                        System.out.print("\t");
                    }
                    System.out.print("*\t");

                    for(int j=(n/2)+2;j<n;j++){
                        System.out.print("\t");
                    }
                    System.out.println("*\t");
                }
            }
            else{
                if(i==n){
                    System.out.print("*\t");

                    for(int j=(n/2)+2;j<n;j++){
                        System.out.print("\t");
                    }
                    for(int j=(n/2)+1;j<=n;j++){
                        System.out.print("*\t");
                    }
                }
                else{
                    System.out.print("*\t");
                    for(int j=(n/2)+2;j<n;j++){
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}