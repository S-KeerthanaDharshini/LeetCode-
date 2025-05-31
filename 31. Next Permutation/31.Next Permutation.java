import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        int temp =0;
        for(int i = n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index!=-1){
        for(int j = n-1;j>=index;j--){
                 if(nums[j] > nums[index]){
                    temp = nums[j];
                    nums[j] = nums[index];
                    nums[index]=temp;
                    break;
                 }
        }
        }
        Arrays.sort(nums,index+1,n);
        System.out.println(Arrays.toString(nums));

    }
}