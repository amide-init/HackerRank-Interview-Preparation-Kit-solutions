import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckBalance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				a[i][j] = in.nextInt();
			}
		}
		for(int i=1;i<n;i++) {
			int value = a[i][0];
			int value1 = a[i][1];
			int j=i-1;
			while(j>=0 && a[j][0]<value) {
				a[j+1][0] = a[j][0];
				a[j+1][1] = a[j][1];
				j = j-1;
			}
			a[j+1][0] = value;
			a[j+1][1] = value1;
		}
		
	 int total = 0;
	 for(int i=0;i<n;i++) {
		 if(a[i][1] == 0) {
			 total += a[i][0];
		 }else {
			 if(a[i][1] == 1 && k>0) {
				 total += a[i][0];
				 k--;
			 }else {
				 total -= a[i][0];
			 }
		 }
	 }
		System.out.println(total);
		

	}

}
