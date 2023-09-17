import java.util.*;
public class avg{
    public static void avarage(int a,int b,int c){
        int avg;
        avg=(a+b+c)/3;
        System.out.println("The avg. of three number is:"+avg);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avarage(a,b,c);
    }
}