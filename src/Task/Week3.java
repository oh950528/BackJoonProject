//3주차과제
//백준1371
package Task;

import java.util.Scanner;

public class Week3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str;
		int[] check = new int[26];

		int max = 0;
		int index;

		while(scan.hasNext()) {
			str = scan.nextLine();
			String[] arr = str.split(" ");

			for(int i = 0; i < arr.length; i++) {
				String s = arr[i];
				for(int j = 0; j < s.length(); j++) {
					index = s.charAt(i) - 'a';
					check[index]++;
					if(check[index] > max) {
						max = check[index];
					}
				}
			}
		}

		for(int i = 0; i < check.length; i++) {
			if(check[i] == max) {
				System.out.println((char) ('a' + i));
			}
		}
	}
}
