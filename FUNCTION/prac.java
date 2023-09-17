import java.util.*;
public class prac{
    public static int sum(int a,int b){
        //System.out.println("Sum is:"+(a+b));
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int x=sum(a,b);
        System.out.println("Sum is:"+x);
        System.out.println("Sum is:"+(sum(9,8,5)));
    }
}