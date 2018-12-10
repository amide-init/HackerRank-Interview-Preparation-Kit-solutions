/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
  Map<Node,Node > m = new HashMap<>();
    if(head ==  null) {
        return false;
    }
    Node temp = head;
    while(temp.next != null) {
        if(m.get(temp) != null){
            return true;
        }
        m.put(temp, temp);
        temp = temp.next;
    }
    return false;
}
