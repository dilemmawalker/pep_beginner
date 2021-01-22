import java.util.Scanner;
public class prob14{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
        int l=0,h=n-1,mid=0,la=-1,ha=-1;
        int d=scn.nextInt();
            while(l<=h){
                mid=(l+h)/2;
                int ele=arr[mid];
                if(ele==d){
                    ha=mid;
                    l=mid+1;
                }
                else if(ele<d){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }

            l=0;h=n-1;mid=0;la=-1;
            while(l<=h){
                mid=(l+h)/2;
                int ele=arr[mid];
                if(ele==d){
                    la=mid;
                    h=mid-1;
                }
                else if(ele<d){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            System.out.println(la);
            System.out.println(ha);
    }
}