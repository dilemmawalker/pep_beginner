import java.util.Scanner;
public class prob9{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n1=scn.nextInt();
        int[]arr1=new int[n1];
        for(int i=0;i<n1;i++)
        arr1[i]=scn.nextInt();

        int n2=scn.nextInt();
        int[]arr2=new int[n2];
        for(int i=0;i<n2;i++)
        arr2[i]=scn.nextInt();

        int n=Math.max(n1,n2);
        int[]arr=new int[n];

        n1--;
        n2--;
        for(int i=n-1;i>=0;i--){
            int a=arr2[n2--];
            int b=0;
            if(n1>=0)
             b=arr1[n1--];
            if(a-b>=0){
                arr[i]=a-b;
            }
            else{
                int idx=i-1;
                while(idx>=0 && arr2[idx]==0){
                    idx--;
                }
                arr2[idx]-=1;
                idx++;
                while(idx<n && idx!=i){
                    arr2[idx]=9;
                    idx++;
                }
                int num=10+arr2[i];
                arr[i]=num-b;
            }
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(!flag && arr[i]==0)
            continue;

            flag=true;
            System.out.println(arr[i]);
        }
    }
}