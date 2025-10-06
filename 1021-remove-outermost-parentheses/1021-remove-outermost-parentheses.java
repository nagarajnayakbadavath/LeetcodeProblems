class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    ans.append(ch);
                }
                st.push(ch);
            }else if(ch==')'){
                st.pop();
                if(!st.isEmpty()){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}