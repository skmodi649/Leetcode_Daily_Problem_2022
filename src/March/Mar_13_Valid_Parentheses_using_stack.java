// Program to check whether the given expression is valid or not using stack
package March;

import java.util.ArrayDeque;
import java.util.Deque;

public class Mar_13_Valid_Parentheses_using_stack {
    public boolean isValid(String s) {
        // ArrayDeque is generally faster than the stack class
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty())
                return false;
            char check;
            switch(ch) {
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check == '(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
