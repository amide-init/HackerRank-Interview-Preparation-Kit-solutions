import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int lef[] = leftRotate(a, k);
        for(int i=0;i<n;i++)
            System.out.print(lef[i]+" ");
    }
    public static int[] leftRotate(int[] a,int k) {
        int n = a.length;
        int[] ar = new int[n];
        int z = k%n;
        if(z == 0){
            ar = a;
        }else {
            int mia[] = Arrays.copyOfRange(a, 0, z);
            int mib[] = Arrays.copyOfRange(a, z, n);
             for(int i=0;i<n-z;i++){
                 ar[i] =mib[i];
             }
            for(int j=n-z, p=0; j<n;j++,p++){
              ar[j] =mia[p];
            }
        }
        return ar;
        
        
    }
}
