class Solution {
    public String toLowerCase(String s) {
        String new_word="";
	char[] letters=s.toCharArray();
	for(int i=0;i<letters.length;i++) {
		
		if(letters[i] >= 65 && letters[i]<=90) {
			new_word+=(char)(letters[i]+32);
		}
		else {
			new_word+=letters[i];
		}
	}
	return new_word;
    }
}