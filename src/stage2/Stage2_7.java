package stage2;

import java.util.Scanner;

public class Stage2_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int result1 = num1 * (num2 % 10);
		int result2 = num1 * ((num2 % 100 - num2 % 10) / 10);
		int result3 = num1 * (num2 / 100);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1 + (result2 * 10) + (result3 * 100));

		scan.close();
	}

}
