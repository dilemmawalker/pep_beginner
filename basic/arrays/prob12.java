import java.util.Scanner;
public class prob12{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
        }
        int limit=(int)Math.pow(2,n);
        for(int i=0;i<limit;i++){
            String b=binary(i,n);
            String ans="";
            for(int j=b.length()-1;j>=0;j--){
                int a=b.charAt(j)-'0';
                if(a==0)
                ans="-\t"+ans;
                else
                ans=arr[j]+"\t"+ans;

            }
            System.out.println(ans);
        }
    }
    public static String binary(int i,int n){
        String a="";
        int c=0;
        while(i>0){
            int r=i%2;
            a=r+a;
            c++;
            i/=2;
        }
        for(int j=c;j<n;j++)
        a='0'+a;
        // System.out.println(a);
        return a;
    }
}