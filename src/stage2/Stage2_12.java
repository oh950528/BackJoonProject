package stage2;

import java.util.Scanner;

public class Stage2_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int result;

		if(num1 > num2) {
			if(num1 > num3) {
				if(num2 > num3)
					result = num2;
				else
					result = num3;

			} else {
				result = num1;
			}
		} else {
			if(num2 > num3) {
				if(num1 > num3)
					result = num1;
				else
					result = num3;
			} else {
				result = num2;
			}
		}

		System.out.println(result);
	}
}
