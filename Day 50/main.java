import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        String [] tokens = path.split("/");
        Stack<String> st = new Stack<>();
        for(String t : tokens)
        {
            if(!st.isEmpty() && t.equals("..")){
                st.pop();
            }
            else if(!Arrays.asList("",".","..").contains(t)){
                st.push(t);
            }
        }
        if(st.isEmpty()) return "/";
        StringBuffer sb = new StringBuffer();
        for(String s : st){
            if( !s.equals("")){
                sb.append("/").append(s);
            }
        }
        return  sb.toString();
    }
}