class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int sum=0;
        while(x>0){
            int rev=x%10;
            sum=(sum*10)+rev;
            x=x/10;
        }
        if(dup==sum) return true;
        else return false;
    }
}