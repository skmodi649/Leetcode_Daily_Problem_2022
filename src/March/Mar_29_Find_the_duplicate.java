package March;

import java.util.HashMap;

public class Mar_29_Find_the_duplicate {
    public int findDuplicate(int[] nums) {
        int val = 0;
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            val = nums[i];
            if(hash.containsKey(val))
                break;
            else
                hash.put(val,1);
        }
        return val;
    }
}
