import java.util.Scanner ;
public class prob2  {
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        if(n>90)
        System.out.print("excellent");
        else if(n>80)
        System.out.print("good");
        else if(n>70)
        System.out.print("fair");
        else if(n>60)
        System.out.print("meets expectations");
        else
        System.out.println("below par");
    }
}