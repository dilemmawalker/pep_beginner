import java.util.Scanner;
public class binarysearch{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int ans=scn.nextInt();
        int[]arr={10,20,30,40,50,60,70,80,90,100};

        int n=10;
        int l=0;
        int h=n-1;
        
        while(l<=h){
            int mid=(l+h)/2;
            int ele=arr[mid];
            if(ele==ans){
                //ans
                System.out.println(mid);
                break;
            }
            else if(arr[l]>ans || arr[h]<ans){
                System.out.println("not found");
                break;
            }
            else if(ele<ans){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
    }
}