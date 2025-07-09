class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxi =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                maxi = (count > maxi)?count : maxi;
            }else if(nums[i] == 0){
                count = 0;
            }
        }
        return maxi;
    }
}