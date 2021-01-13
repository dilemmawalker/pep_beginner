import java.util.Scanner;
public class prob14{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for(int i=1;i*i<=n;i++){
           
            System.out.println(i*i);
        }
    }
}