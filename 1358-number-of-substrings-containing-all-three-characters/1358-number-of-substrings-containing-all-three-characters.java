class Solution {
    public int numberOfSubstrings(String s) {
        int right=0;
        int left=0;
        int validSubStringCount=0;
        int charFrequency[]=new int[3];

        while(right<s.length()){
            charFrequency[s.charAt(right)-'a']++;
            while(charFrequency[0]>0 && charFrequency[1]>0 && charFrequency[2]>0){
                validSubStringCount+=s.length()-right;
                charFrequency[s.charAt(left++)-'a']--;
            }
            right++;
        }
        return validSubStringCount;
    }
}