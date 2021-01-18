import java.util.Scanner;
public class prob11{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print("-\t");
        }
        System.out.println();
       for(int i=n-1;i>=0;i--){
           
            for(int j=0;j<i;j++){
                System.out.print("-\t");
            }
            System.out.print(arr[i]+"\t");
            for(int j=i+1;j<n;j++){
                System.out.print("-\t");
            }
            System.out.println();

           for(int j=n-1;j>=i;j--){
            String ans="";
               
           for(int l=j+1;l<n;l++){
            for(int k=0;k<i;k++)
            System.out.print("-\t");

            System.out.print(arr[i]+"\t");
            for(int k=i;k<j;k++)
            System.out.print("-\t");

            ans+=arr[l]+"\t";
            System.out.print(ans);

            for(int k=l+1;k<n;k++)
            System.out.print("-\t");

            System.out.println();
        }
            }
       }
    }
}