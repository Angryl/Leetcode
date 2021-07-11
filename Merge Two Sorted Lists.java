class Solution {
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      // Edge case both list are null
      if (l1 == null && l2 == null) {
         return null;
      }

      // edge case one of the list is null 
      if (l1 == null && l2 != null) {
         return l2;
      }

      // edge case one of the list is null 
      if (l1 != null && l2 == null) {
         return l1;
      }

      // Create dummy node
      ListNode dummy = new ListNode();
      ListNode current = dummy;

      while (l1 != null && l2 != null) {
         if (l1.val <= l2.val) {
            current.next = l1;
            l1 = l1.next;
         } else {
            current.next = l2;
            l2 = l2.next;
         }

         current = current.next;
      }
      
      // Edge case when one of list is bigger than another.
      if (l1 == null) {
         current.next = l2;
      }

      if (l2 == null) {
         current.next = l1;
      }

      return dummy.next;

   }
}
