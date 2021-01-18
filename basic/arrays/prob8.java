import java.util.Scanner;
public class prob8{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n1=scn.nextInt();
        int[]arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int[]arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }
        int[]arr=new int[Math.max(n1,n2)];
        n1--;
        n2--;
        int c=0;
        for(int i=arr.length-1;i>=0;i--){
            int sum=0;
            sum+=n1>=0?arr1[n1--]:0;
            sum+=n2>=0?arr2[n2--]:0;
            sum+=c;

            c=sum/10;
            sum%=10;
            arr[i]=sum;
            
        }
        if(c!=0)
        System.out.println(c);
        for(int i=0;i<=arr.length-1;i++){
           System.out.println(arr[i]);
        }
    }
}