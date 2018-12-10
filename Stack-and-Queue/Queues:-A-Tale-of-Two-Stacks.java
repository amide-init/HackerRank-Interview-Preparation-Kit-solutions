import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
        static class MyQueue<T> {
        LinkedList<T> ll = new LinkedList<>();
        
        public void enqueue(T x) {
            ll.addLast(x);
        }
        public void dequeue() {
            ll.removeFirst();
        }
        public T peek() {
            return ll.peekFirst();
        }
        
    }
}
