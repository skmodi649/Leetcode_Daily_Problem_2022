package February;

import java.util.Scanner;

public class Feb_1_BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {

        // ************ NAIVE SOLUTION ****************
       /* for(int i = 0 ; i < prices.length ; i++){
            for(int j = i + 1 ; j < prices.length ; j++){
                int diff = prices[j] - prices[i];
                if(diff > max)
                    max = diff;
            }
        }*/

        // ************** Efficient solution ****************
        int least_selling_price = Integer.MAX_VALUE;
        int profit = 0;
        int max = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < least_selling_price){
                least_selling_price = prices[i];
            }
            profit = prices[i] - least_selling_price;
            if(profit > max)
                max = profit;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in the array : ");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        System.out.println("Maximum profit : " + maxProfit(arr));
    }
}
