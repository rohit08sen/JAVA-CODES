import java.util.*;
public class pairs_In_array{
    public static void pairs(int ar[],int n){
        int i;
        int j;
        for(i=0;i<n-1;i++){
            System.out.print("The pairs of "+ar[i]+" is:");
            for(j=i+1;j<n;j++){
                System.out.print("("+ar[i]+","+ar[j]+")");
            }
            System.out.println();
        }
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
        pairs(ar,n);
    }
}
