class Solution {
     static int temp=0;
    public static  void reverse(int[] arr,int start,int end){
            while(start <= end){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    public void rotate(int[] arr, int d) {
         int n=arr.length;
     d=d%n;
      
        reverse(arr,n-d,n-1);
          reverse(arr,0,n-d-1);
        reverse(arr,0,n-1);

    }
}