class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int left=0;
        int ans=0;
        while(left<s.length()){
            char ch=s.charAt(left);

            if(left+1<s.length()){
                char ch2=s.charAt(left+1);
                if(map.get(ch)>=map.get(ch2)){
                    ans+=map.get(ch);
                }else{
                    ans+=map.get(ch2)-map.get(ch);
                    left++;
                }
            }else{
                ans+=map.get(ch);
            }
            left++;
        }
        return ans;
    }
}