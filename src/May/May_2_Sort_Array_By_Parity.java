package May;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class May_2_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1)
            return nums;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        int k = 0;
        for(int a = 0 ; a < even.size() ; a++){
            nums[k] = even.get(a);
            k++;
        }
        for(int b = 0 ; b < odd.size() ; b++){
            nums[k] = odd.get(b);
            k++;
        }
        return nums;
    }
}
