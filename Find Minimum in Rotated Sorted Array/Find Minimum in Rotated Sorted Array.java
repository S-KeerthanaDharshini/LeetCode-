class Solution {
    public int findMin(int[] arr) {
        int low=0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;
        int mid =0;
        while(low <= high){
               mid = (low+high)/2;
               if(arr[low] <= arr[high]){
                min = Math.min(min,arr[low]);
                break;
               }
               if(arr[low] <=arr[mid]){
                min = Math.min(min,arr[low]);
                low = mid+1;
               }
               else{
                min = Math.min(min,arr[mid]);
              
                high = mid -1;
               }
        }
        return min;
    }
}