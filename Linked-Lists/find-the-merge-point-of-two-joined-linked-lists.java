

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
         SinglyLinkedListNode temp1 = head1;
         
         while(temp1 != null) {
             SinglyLinkedListNode temp2 = head2;
             while(temp2 != null) {
                 if(temp1 == temp2) {
                     return temp1.data;
                 }
                 temp2  = temp2.next;
             }
              temp1 = temp1.next;

         }
         return -1;

    }
