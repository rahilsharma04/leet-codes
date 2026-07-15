import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int cs  = 0 ;
        int ms = Integer.MIN_VALUE;

        int max_element = Integer.MIN_VALUE;
    
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i] > max_element)
            {
                max_element = nums[i];
            }
        }
        if (max_element < 0)
        {
            return max_element;
        }

        for(int i =0; i< nums.length;i++)
        {
            cs += nums[i];
            if(cs < 0)
            {
                cs =0;
            }
            ms = Math.max(cs,ms);

        }
        return ms;
    }
}