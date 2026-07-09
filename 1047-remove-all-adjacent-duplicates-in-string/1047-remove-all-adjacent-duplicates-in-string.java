class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)) st.pop();
            else st.push(s.charAt(i));
        }
        String r="",f="";
        while(!st.isEmpty()){
            f+=st.pop();
        }
        for(int i=f.length()-1;i>=0;i--){
            r+=f.charAt(i);
        }
        return r;
    }
}