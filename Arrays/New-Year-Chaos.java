import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 static void minimumBribes(int[] q) {
       int swap = 0;
       int hash[] =  new int[q.length +1];
       for(int i=0;i<q.length;i++) {
            hash[q[i]] = i+1;
          
       }
       
       for(int key=q.length;key>0;key--) {
           int val = hash[key];
           if(Math.abs(val-key) >2) {
               System.out.println("Too chaotic");
               return;
           }
           for(int i=val;i<key;i++) {
               int temp = q[i-1];
               q[i-1] = q[i];
               q[i] = temp;
               hash[q[i-1]]--;
               hash[key]++;
               swap++;
           }
       }
       System.out.println(swap);
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
