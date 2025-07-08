class Solution {
    void pushZerosToEnd(int[] nums) {
    int n=nums.length;
        int temp =0;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                j=i;break;
            }
        }
        if(j!=-1) {
       for(int i=j+1;i<n;i++){
        if(nums[i]!=0){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
       }}
        
    }
}