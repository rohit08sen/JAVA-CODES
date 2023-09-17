import java.util.*;
public class binarysearch{
    public static void binarySearch(int ar[],int n,int key){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(ar[mid]==key){
                System.out.print("The key "+key+" is found at "+mid+" index.");
                return;
            }
            else if(ar[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("Sorry key is not found.");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        int key,n;
        System.out.print("Enter the size of array you want:");
        n=sc.nextInt();
        System.out.println("Enter a sorted array elements of size "+n);
        System.out.print("Enter the array elemnts in sorted order:");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the value you want search:");
        key=sc.nextInt();
        binarySearch(ar,n,key);
    }
}