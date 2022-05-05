package May;

import java.util.LinkedList;
import java.util.Queue;

public class May_5_Stack_using_Queue {

    Queue<Integer> q;

    public May_5_Stack_using_Queue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for(int i=0; i<q.size()-1; i++) q.add(q.remove());
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
