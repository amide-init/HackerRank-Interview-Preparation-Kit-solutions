import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stepPerms function below.
    static int stepPerms(int n) {
        int memo[] = new int[n+1];
        Arrays.fill(memo, -1);
        
        return insidefn(n, memo);

    }
    static int insidefn(int n, int[] memo){
        
        if(n<0){
            return 0;
        }else if(n == 0){
            return 1;
        }else if(memo[n]>-1){
            return memo[n];
        }else{
            memo[n] = insidefn(n-1, memo)+insidefn(n-2, memo)+insidefn(n-3, memo);
            return  memo[n];
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
