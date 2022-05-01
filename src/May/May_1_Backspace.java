package May;

import java.util.Stack;

public class May_1_Backspace {
    public boolean backspaceCompare(String s, String t) {
        //creating 2 stacks to store character s1 for string s and s2 for string t
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        // for loop to fill the charater of s into stack s1
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // if we got '#' while filling the stack s1 we simply remove the top value of the stack
            if(ch=='#'){
                if(!s1.isEmpty()) s1.pop();
            }
            else{
                // otherwise we just keep put the charater in stack s1
                s1.push(ch);
            }


        }
        // for loop to fill the charater of t into stack s2
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            // if we got '#' while filling the stack s2 we simply remove the top value of the stack
            if(ch=='#'){
                if(!s2.isEmpty()) s2.pop();
            }
            else{
                // otherwise we just keep put the charater in stack s2
                s2.push(ch);
            }
        }
        //Now after completely filling all the characters of s and t String we will check weather to return true or false
        //if the size of both stack is not equal then return false
        if(s1.size()!= s2.size()) return false;
        //if size is equal the start a while loop which will compare the characters of both stack till s1 stack get empty
        while(!s1.isEmpty()){
            char ch1 = s1.pop();//Storing the top value of stack s1 in ch1
            char ch2 = s2.pop();//Storing the top value of stack s1 in ch1
            if(ch1!=ch2) return false;// If the top values are not same then return false else while loop runs again
        }

        return true;// if all the conditions are satisfied then return true
    }
}
