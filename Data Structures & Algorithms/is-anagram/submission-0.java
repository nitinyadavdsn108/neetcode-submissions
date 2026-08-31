class Solution {
    public boolean isAnagram(String s, String t) {

// check whether lengths of both anagrams are equal
                if(s.length() != t.length()){
                    return false;
                }

// count frequencies of each character
    int[] count = new int[26];

// s = 'act' and t = 'cat' then,
// for a it will be +1 then -1 = 0
// fpr c it will be +1 then -1 = 0
// fpr t it will be +1 then -1 = 0
// if the are anagrams count array will be all zeros

    for(int i=0 ; i < s.length() ; i++){
        count[s.charAt(i)-'a']++;
        count[t.charAt(i)-'a']--;
    }



    for(int i=0 ; i < 26 ; i++){
        if(count[i] != 0 ){
            return false;
        }
    }

    return true;

    }
}
