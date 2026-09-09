class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }


        int left = 0;
        int right = 0;
        while(right < s2.length()){
            // add right character
            char ch = s2.charAt(right);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(right-left+1 == s1.length()){

                if(map1.equals(map2)){
                    return true;
                }

                char leftChar = s2.charAt(left);
                map2.put(leftChar , map2.get(leftChar)-1);

                if(map2.get(leftChar)==0){
                    map2.remove(leftChar);
                }
                left++;
            }
            right++;
        }

        return false;
    }
}
