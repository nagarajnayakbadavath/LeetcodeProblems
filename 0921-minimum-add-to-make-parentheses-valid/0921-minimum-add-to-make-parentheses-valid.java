class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();

        int open=0;
        int close=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                if(st.isEmpty()){
                    st.push(ch);
                }else if(st.peek()=='('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
        }
        return st.size();
    }
}