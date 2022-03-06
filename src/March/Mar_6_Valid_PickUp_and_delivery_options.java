/* Difficulty : Hard */
// Bottum_Up and dynamic programming used
// Reference link : https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/discuss/1824163/Java-Simple-O(N)-Explanation-with-Diagrams
package March;

import java.util.Scanner;

public class Mar_6_Valid_PickUp_and_delivery_options {
    public int countOrders(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 6;
        int prev_ans = 6;

        long mod = 1000000007;
        for(int i = 3;i <= n ; i++)
        {
            long k = (long) (i * 2 - 1);    // k = total number of places in n-1
            long each = (k*(k+1))/2;     //total possibilities in each case of n-1
            long total = each * (long)prev_ans;    //total possibilities for n
            prev_ans = (int) (total%mod);
        }

        return prev_ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mar_6_Valid_PickUp_and_delivery_options obj = new Mar_6_Valid_PickUp_and_delivery_options();
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int val = obj.countOrders(n);
        System.out.println(val);
    }
}
