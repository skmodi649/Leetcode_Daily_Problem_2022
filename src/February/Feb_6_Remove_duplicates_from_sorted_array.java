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
