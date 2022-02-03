// ********** Efficient solution using HashMap ************

package February;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Feb_3_4Sum_II {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int a : nums1)
            for(int b : nums2){
                int s = a+b;
                map.put( s, map.getOrDefault(s, 0)+1 );
            }

        int result=0;
        for(int c : nums3)
            for(int d : nums4){
                int s = -c-d;
                result += map.getOrDefault(s, 0);
            }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays : ");
        int n = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        int[] num3 = new int[n];
        int[] num4 = new int[n];
        System.out.println("Enter first array values : ");
        for(int i = 0 ; i < n ; i++)
            num1[i] = sc.nextInt();
        System.out.println("Enter second array values : ");
        for(int i = 0 ; i < n ; i++)
            num2[i] = sc.nextInt();
        System.out.println("Enter third array values : ");
        for(int i = 0 ; i < n ; i++)
            num3[i] = sc.nextInt();
        System.out.println("Enter fourth array values : ");
        for(int i = 0 ; i < n ; i++)
            num4[i] = sc.nextInt();
        System.out.println("Number of such tuples : " + fourSumCount(num1 , num2 , num3 , num4));
    }
}
