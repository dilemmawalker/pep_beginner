import java.util.Scanner;
public class prob5{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int r=0;int c=-1;
        int i=0,j=0;
        boolean flag=true;
        
        while(true){
            for(i=c+1;i<m;i++){
                if(arr[r][i]==1)
                break;
            }
            c=i;
            if(i==m)
            break;
            
           for( i=r+1;i<n;i++){
            if(arr[i][c]==1)
                break;
           }
           r=i;
           if(i==n)
           break;
           
           for(i=c-1;i>=0;i--){
            if(arr[r][i]==1)
                break;
           }
           c=i;
           if(i==-1)
           break;
           
           for(i=r-1;i>=0;i--){
            if(arr[i][c]==1)
            break;
           }
           r=i;
           if(i==-1)
           break;
           
        }
        if(r==-1)
        r++;
        else if(c==-1)
        c++;
        else if(r==n)
        r--;
        else if(c==m)
        c--;

        System.out.println(r);
        System.out.println(c);
    }
}