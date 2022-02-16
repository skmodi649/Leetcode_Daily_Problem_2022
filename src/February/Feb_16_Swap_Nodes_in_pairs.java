package February;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  // ****************** Iterative approach ***********************

public class Feb_16_Swap_Nodes_in_pairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode temp = head;
        while (temp != null && temp.next != null) {

            // Now simply swapping the data
            int k = temp.val;
            temp.val = temp.next.val;
            temp.next.val = k;
            temp = temp.next.next;
        }
        return head;
    }
}


// ********************* RECURSIVE APPROACH ******************************

/*
static void pairWiseSwap(node head)
{

    if (head != null && head.next != null) {


            swap(head.data, head.next.data);


            pairWiseSwap(head.next.next);
            }
            */