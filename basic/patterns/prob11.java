import java.util.Scanner;
public class prob11{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int a=(n/2)-1;
        int b=3;
        for(int i=1;i<=n;i++){
            if(i<=(n/2)+1){
                if(i==1){
                    for(int j=i;j<=n;j++){
                        System.out.print("*\t");
                    }
                }
                else{
                    for(int j=1;j<i;j++){
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    for(int j=1;j<=a;j++){
                        System.out.print("\t");
                    }
                    for(int j=2;j<=a;j++){
                        System.out.print("\t");
                    }
                    if(i!=(n/2)+1)
                    System.out.print("*");
                    a--;
                }
            }
            else{
                for(int j=1;j<=(n-i);j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=b;j++){
                    System.out.print("*\t");
                }
                b+=2;
            }
            System.out.println();
        }
    }
}