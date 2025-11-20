class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=0;
        int maxLen=0;

        int l=0;
        int r=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.get(ch)>1){
                int val=map.get(s.charAt(l))-1;
                if(val==0) map.remove(s.charAt(l));
                else map.put(s.charAt(l),val);
                l++;
            }
            len=r-l+1;
            maxLen=Math.max(maxLen,len);
            r++;
        }
        return maxLen;
    }
}