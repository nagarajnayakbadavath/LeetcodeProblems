class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int max=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.add('(');
                max=Math.max(max,stack.size());
            }else if(s.charAt(i)==')'){
                stack.pop();
            }else{
                continue;
            }
        }
        return max;
    }
}