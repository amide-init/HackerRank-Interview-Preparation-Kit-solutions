import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ar[][] = new int[6][6];
		for(int i=0;i<6;i++) {
		   for(int j=0;j<6;j++) {
				ar[i][j] = in.nextInt();
			}
		}
		System.out.println(hourglassSum(ar));

	}
    static int hourglassSum(int[][] arr) {
    	int res = Integer.MIN_VALUE;
    	for(int i=0;i<4;i++) {
    		for(int j=0;j<4;j++) {
    			int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]
    					+arr[i+1][j+1]
    				   + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    			if(sum>res) {
    				res = sum;
    			}
    		}
    	}
       return res;

    }

}
