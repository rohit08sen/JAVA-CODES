import java.util.*;
public class decTobin{
    public static void decTobin(int dec){
        int pow=0;
        int bin=0;
        int x=dec;
        while(dec>0){
            int rem=dec%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            dec=dec/2;
        }
        System.out.println("The binary form of "+x+"="+bin);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int dec=sc.nextInt();
        decTobin(dec);
    }
}