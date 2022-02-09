// Difficulty : Medium
// Link : https://leetcode.com/problems/k-diff-pairs-in-an-array/

package February;

import java.util.HashMap;
import java.util.Map;

public class Feb_9_k_diff_Pairs_in_array {
 // *********** Efficient solution *****************

    public int findPairs(int[] nums, int k) {
      /*  if(k == 0){
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
                if(!list.contains(nums[i]))
                    list.add(nums[i]);
            }
            return (nums.length - list.size());
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++)
            list.add(nums[i]);
        int count = 0;
        List<Integer> buffer = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int max = nums[i] + k;
            int min = nums[i] - k;
            if()
        }
        return count; */

        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:map.keySet()) {
            Integer val = map.getOrDefault(x+k,0);
            if((k==0&&val>1)||(k>0 &&val>0)) {
                count++;
            }
        }
        return count;
    }
}
