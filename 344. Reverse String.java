class Solution {
    public char[] reverseString(char[] s) {
        char temp =' ';
        int i=0;
        int j=s.length-1;
        while(i < j){
            temp= s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        return s;
    }
}