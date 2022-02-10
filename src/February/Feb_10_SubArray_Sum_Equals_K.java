package February;

import java.util.HashMap;

public class Feb_10_SubArray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap();
        hash.put(0, 1);
        int sum = 0, ans = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(hash.containsKey(sum - k)) {
                ans += hash.get(sum - k);
            }
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
