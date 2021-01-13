import java.util.Scanner;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        for(int i=n;i<=m;i++){
            int c=0;
            for(int j=1;j<=(int)Math.sqrt(i);j++){
                if(i%j==0)
                c++;
            }
            c*=2;
            if(c==2)
            System.out.println(i);
        }
    }
}