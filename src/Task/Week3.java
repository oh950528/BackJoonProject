//3��������
//����1371
package Task;

import java.util.Scanner;

public class Week3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str;
		int[] check = new int[26];

		int max = 0;
		int index;

		while(scan.hasNextLine()) {
			str = scan.nextLine();
			String[] arr = str.split(" ");

			for(int i = 0; i < arr.length; i++) {
				String s = arr[i];
				for(int j = 0; j < s.length(); j++) {
					index = s.charAt(j) - 'a';
					check[index]++;
					if(check[index] > max) {
						max = check[index];
					}
				}
			}
		}

		for(int i = 0; i < 26; i++) {
			if(check[i] == max) {
				System.out.print((char) ('a' + i));
			}
		}
	}
}
