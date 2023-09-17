import java.util.*;
public class largest{
    public static void Largest(int ar[],int n){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>largest){
                largest=ar[i];
            }
        }
        System.out.print("The largest element of the array is "+largest);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        System.out.print("Enter the size of array you want :");
        int n=sc.nextInt(); 
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Largest(ar,n);
    }
}