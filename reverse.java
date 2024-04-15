import java.util.*;
public class reverse{
    public static void reverse(int ar[],int n){
        int start=0;
        int end=n-1;
        int temp;
        while(start<end){
            temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
        System.out.print("The reversed array is: ");
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+"\t");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        System.out.print("Enter the size of array :");
        int n=sc.nextInt(); 
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        reverse(ar,n);
    }
}
