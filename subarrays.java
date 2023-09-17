import java.util.*;
public class subarrays{
    public static void subArrays(int ar[],int n){
        int i,j,k;
        for(i=0;i<n;i++){
            System.out.print("The sub arrays of "+ar[i]+" are:\n");
            for(j=0;j<n;j++){
                for(k=i;k<=j;k++){
                    if(i==j){
                        System.out.print("|"+ar[i]+"|");
                    }
                    else{
                        System.out.print("|"+ar[k]+"|");
                    }
                }
                System.out.print("\n");
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
        subArrays(ar,n);
    }
}