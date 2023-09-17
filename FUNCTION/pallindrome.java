import java.util.*;
public class pallindrome{
    public static void Ispallindrome(int num){
        int rev=0;
        int x=num;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(x==rev){
            System.out.print("YES!It is a pallindrome");
        }
        else{
            System.out.println("Sorry!It is not a pallindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        Ispallindrome(a);
    }
}