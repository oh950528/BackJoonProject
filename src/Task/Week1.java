//2.구현 문제
package Task;

import java.util.Scanner;

public class Week1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next().toLowerCase();
		String arr[];
		int index = 0;
		
		StringBuffer sb = new StringBuffer(str);
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(i - 1)) {
				sb.insert(i + index, '/');
				index++;
			}
		}
		
		System.out.println(sb.toString());

	}
}
