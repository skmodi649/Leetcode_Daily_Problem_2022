// *************** Efficient solution using the HashMap ******************
/*
Algorithm :
Step 1 : START
Step 2 : Use an HashMap to store the number as key and its frequency as value
Step 3 : If the value for particular key becomes more than 2 than increment count and also make arr[i] = Integer.MAX_VALUE
Step 4 : Now just sort the resultant array in ascending order and return nums.length-count;
Step 5 : STOP
 */

package February;

import java.util.Arrays;
import java.util.HashMap;

public class Feb_6_Remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
                if(hm.get(nums[i])>2){
                    nums[i]=Integer.MAX_VALUE;
                    count++;
                }
            }
            else hm.put(nums[i],1);
        }
        Arrays.sort(nums);
        return nums.length-count;
    }
}
