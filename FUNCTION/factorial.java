import java.util.*;
public class factorial{
    public static int fact(int n){
        int i,f=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.print("The factorial of the number is "+fact(num));
    }
}