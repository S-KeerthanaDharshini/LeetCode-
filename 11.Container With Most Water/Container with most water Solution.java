class Solution {
    public int maxArea(int[] height) {
        int n =height.length;
        int i =0 ;
        int j = n-1;
        int max = 0;
while(i<j){
    int litre =(Math.min(height[i],height[j])) * (j-i)  ;
    if(max < litre){
        max = litre;
    }
    if(height[i] < height[j] ) i++;
    else j--;

}
return max;
    }
}

//i=left
//j=right