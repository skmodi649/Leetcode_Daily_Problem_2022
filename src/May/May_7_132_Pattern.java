package May;

import java.util.Stack;

public class May_7_132_Pattern {
    public boolean find132pattern(int[] nums) {
        if(nums == null || nums.length < 3)
            return false;


        int num = Integer.MIN_VALUE;
        Stack<Integer> stk = new Stack();
        for(int i = nums.length-1;i>=0;i--)
        {
            if(nums[i]<num)
                return true;  // nums[i] < nums[k] , and nums[j] was chosen in previous iteration so given //condition reached
            while(!stk.isEmpty() && nums[i]>stk.peek())
            {//nums[i] = nums[j]
                num = stk.pop(); // always bigger than previous num
            }
            stk.push(nums[i]);
        }
        return false;
    }
}
