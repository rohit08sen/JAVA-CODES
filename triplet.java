import java.util.*;
public class triplet{
    public static void triplet_find(int ar[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i+2;k<n;k++){
                    if((i!=j&&j!=k&&k!=i)&&(ar[i]+ar[j]+ar[k]==0)){
                        int triplet[]={ar[i],ar[j],ar[ks]};
                        // System.out.print("The triplet are: ");
                        System.out.print("[");
                        for(int l=0;l<triplet.length;l++){
                            System.out.print(" "+triplet[l]);
                        }
                        System.out.print("]");
                    }
                }
            }
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
        triplet_find(ar,n);
    }
}