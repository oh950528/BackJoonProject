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
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(i - 1)) {
				sb.insert(i + index, '/');
				index++;
			}
		}
		
		System.out.print(sb.toString());
		System.out.println();
		
		arr = sb.toString().split("/");
		
		int count;
		char c;
		
		for(int i = 0; i < arr.length; i ++) {
			count = arr[i].length();
			c = arr[i].charAt(0);
			
		}
	}
}
