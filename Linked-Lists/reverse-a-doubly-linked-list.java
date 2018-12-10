    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
         DoublyLinkedListNode back = null;
         DoublyLinkedListNode front = null;
         DoublyLinkedListNode current = head;
         while(current != null) {
             front = current.next;
             current.next = back;
             back = current;
             current = front;
         }
         return back;

    }
