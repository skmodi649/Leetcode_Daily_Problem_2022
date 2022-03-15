package March;

import java.util.Stack;

public class Mar_15_Minimum_Remove_to_make_valid_string {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> s1=new Stack<>();
        int count_op=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') {
                count_op++;
                s1.add(s.charAt(i));
            }
            else if(s.charAt(i)==')' && count_op>0) {
                count_op--;
                s1.add(s.charAt(i));
            }
            else if(s.charAt(i)!=')') {
                s1.add(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder("");
        while(!s1.isEmpty()){
            if(s1.peek()=='(' && count_op>0) {count_op--;s1.pop();}
            else sb.append(s1.pop());
        }
        return sb.reverse().toString();
    }
}
