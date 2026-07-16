class Solution {
    public int trap(int[] nums) {
        int leftmax[] = new int[nums.length];
        leftmax[0] = nums[0];

        for(int i=1; i<nums.length;i++){

            leftmax[i] = Math.max(leftmax[i-1],nums[i]);
        }

        int rightmax[] = new int[nums.length];
        rightmax[nums.length-1] = nums[nums.length-1];

        for(int i=nums.length-2; i>=0 ; i--){

            rightmax[i]= Math.max(rightmax[i+1],nums[i]);
        }


        int trappedwater = 0;

        for(int i=0; i<nums.length;i++){

            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel - nums[i];
        }

        return trappedwater;
    }
}