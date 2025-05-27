class Solution {
    public boolean isPalindrome(String s) {
        //an empty string reads the same forward and backward, it is a palindrome.
        if (s == null || s.length() == 0) {
    return true;
}
// Check for non-ASCII characters
for (int i = 0; i < s.length(); i++) {
    if ((int) s.charAt(i) > 127) {
        return false;
    }
}
//converting into Lowercase
s = s.toLowerCase();
//StringBuilder for storing only alpha numeric characters
StringBuilder builder = new StringBuilder();
for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    //isLetterOrDigit for selection Alphabets and Numbers
    if (Character.isLetterOrDigit(ch)) {
        builder.append(ch);
    }
}
String firstword = builder.toString();
//The reason for creating firstword and then creating a new StringBuilder to reverse it is to avoid modifying the original cleaned string (firstword) during the comparison. 
String newword = new StringBuilder(firstword).reverse().toString();

return firstword.equals(newword);//checks string is identical to one another

}
}