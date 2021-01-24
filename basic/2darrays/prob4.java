import java.util.Scanner;
public class prob4{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int a=scn.nextInt();
                arr[i][j]=a;
            }
        }
        int n1=Math.min(n,m);
        int no=n1%2==0?n1/2:(n1/2)+1;
        boolean flag=false;
        if(no!=n1/2)
        flag=true;
        int r=0,c=0;
        while(r<no && c<no){
            for(int j=r;j<(n-r);j++){
                System.out.println(arr[j][c]);
            }
           
           for(int j=c+1;j<m-c;j++){
               System.out.println(arr[(n-r-1)][j]);
           }
           if(flag && (r+1==no || c+1==0))
           break;

           for(int j=n-r-2;j>=r;j--){
            System.out.println(arr[j][m-c-1]);
           }
           for(int j=(m-c-2);j>c;j--){
               System.out.println(arr[r][j]);
           }
           r++;
           c++;
        }
    }
}