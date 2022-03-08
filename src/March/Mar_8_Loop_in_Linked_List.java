// Program to find the loop in the linked list using the concept of HashSet

package March;

import java.util.HashSet;
import java.util.Set;

class ListNode5 {
      int val;
      ListNode5 next;
      ListNode5(int x) {
          val = x;
          next = null;
      }
  }


public class Mar_8_Loop_in_Linked_List {
    public boolean hasCycle(ListNode5 head) {
        if(head == null)
            return false;
        // Using Set of ListNode type
        Set<ListNode5> set = new HashSet<>();
        ListNode5 temp = head;
        while(temp != null){
            if(set.contains(temp))
                return true;
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
