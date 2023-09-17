import java.util.*;
public class update{
    public static void update(int ar[],int n){
        for(int i=0;i<n;i++){
            ar[i]=ar[i]+2;
        }
        System.out.print("The updated array is :");
        for(int i=0;i<n;i++){
            System.out.print("\t"+ar[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int [20];
        int n;
        System.out.print("Enter the size of array:");
        n=sc.nextInt();
        System.out.println();
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        update(ar,n);
    }
}