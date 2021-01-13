import java.util.Scanner;
public class prob7{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(i*n));
        }
    }
}