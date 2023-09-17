import java.util.*;
public class binaryTodecimal{
    public static void binTodec(int bnum){
        int pow=0;
        int dec=0;
        while(bnum>0){
            int lastdigit=bnum%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            bnum=bnum/10;
        }
        System.out.println("The decimal number is:"+dec);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a binary number:");
        int bin=sc.nextInt();
        binTodec(bin);
    }
}