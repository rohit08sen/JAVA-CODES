import java.util.*;
public class sAsum_bruteForce{
    public static void maxSum(int ar[],int n){
        int i,j,k;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=i;k<=j;k++){
                    if(i==j){
                        System.out.print("|"+ar[i]+"|");
                    }
                    else{
                        System.out.print("|"+ar[k]+"|");
                    }
                   sum=sum+ar[k];
                   if(max<sum){
                    max=sum;
                   } 
                }
                int x=sum;
                    if(x==0){
                    System.out.println();
                }
                else{
                    System.out.print("Sum is "+x+"\t");
                }
                sum=0;
                System.out.print("\n");
            }
        }
            //  System.out.print("\n");
            System.out.print("The maximum subarray sum is: "+max);
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
        maxSum(ar,n);
    }
}