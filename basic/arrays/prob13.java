import java.util.Scanner;
public class prob13{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
        }
        int d=scn.nextInt();
        int l=0,h=n-1;
        int mid=0;
        boolean flag=true;
        while(l<=h){
            mid=(l+h)/2;
            int ele=arr[mid];
            if(ele==d){
                flag=false;
                System.out.println(ele);
            }
            else if(ele<d){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(flag){
            System.out.println(arr[l]);
            System.out.println(arr[h]);
        }
    }
}