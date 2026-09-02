class Solution {
    public void reverseString(char[] s) {
       for(int i =0 ; i < s.length/2 ; i++){
            // swap ith with length()-i-1 
        char ch = s[i];
        s[i] = s[s.length-1-i];
s[s.length-1-i] = ch;
       } 

    }
}