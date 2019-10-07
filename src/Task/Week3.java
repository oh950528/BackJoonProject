//3주차과제
//백준1371
package Task;

import java.util.Scanner;

public class Week3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str;
		int[] check = new int[]26;

		int max = 0;
		int index;

		for(int i = 0; i < check.length; i++) {
			if(check[i] == max) {
				System.out.println((char) ('a' + i));
			}
		}
	}
}
