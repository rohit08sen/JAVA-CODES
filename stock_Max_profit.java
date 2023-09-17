import java.util.*;
public class stock_Max_profit{
    public static void Max_profit(int prices[],int n){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                if(maxProfit<profit){
                    maxProfit=profit;
                }
            }
            else{
                buyPrice=prices[i];
            }
        }
        System.out.print("The Maximum profit possible is : "+maxProfit);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int prices[]=new int[20];
        System.out.print("Enter no. of Stock prices in different day: ");
        int n=sc.nextInt();
        System.out.print("Enter The prices of stock in each day: ");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        Max_profit(prices,n);
    }
}