import java.util.*;
public class repeat_No_check{
    public static boolean check(int ar[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]==ar[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        System.out.print("Enter the no. of array element: ");
        int n=sc.nextInt();
        System.out.print("Enter the array element: ");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print(check(ar,n));
    }
}