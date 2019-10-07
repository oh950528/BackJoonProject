package stage3;

import java.util.Scanner;

public class Stage3_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int len = scan.nextInt();

		for(int i = 1; i <= len; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int result = num1 + num2;

			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + result);
		}
	}
}
