

    // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode temp = head;
        DoublyLinkedListNode temp1 = null;
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if(head ==  null) {
            return node;
        }
        if(head.data > data)  {
           node.next = head;
           head.prev = node;
           head = node;
           return head;
        }
        
        while(temp.data<data){
            if(temp.next ==  null) {
                 temp.next = node;
                 node.prev = temp;
                 return head;
             }
             temp1 = temp;
             temp = temp.next;
             
        } 
        temp1.next = node;
        node.prev = temp1;
        node.next = temp;
        temp.prev = node; 
        return head;


    }
