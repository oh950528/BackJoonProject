package stage2;

import java.util.Scanner;

public class Stage2_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();

		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println('1');
		} else if(year % 400 == 0) {
			System.out.println('1');
		} else {
			System.out.println('0');
		}
	}
}
