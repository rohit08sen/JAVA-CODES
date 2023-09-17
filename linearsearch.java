import java.util.*;
public class linearsearch{
    public static void linearsearch(int ar[],int n,int key){
        for(int i=0;i<n;i++){
            if(ar[i]==key){
                System.out.print("Element is found at index no.="+i);
                return;
            }
        }
        System.out.print("Element not found");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        int key,n;
        System.out.print("Enter the size of array you want:");
        n=sc.nextInt();
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the value you want search:");
        key=sc.nextInt();
        linearsearch(ar,n,key);
    }
}