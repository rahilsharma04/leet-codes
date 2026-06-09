class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int curr = 0;
        boolean allNegative = true;
        int largestn = Integer.MIN_VALUE;

        for(int i =0; i<nums.length;i++){
            if(nums[i] >= 0)
            {
                allNegative = false;
            }

            largestn = Math.max(nums[i],largestn);

            curr += nums[i];

            if(curr < 0)
                curr = 0;
            
            ms = Math.max(curr,ms);

            if(allNegative)
            {
                ms = largestn;
            }


            
        }
        return ms;
    }
}