package stage2;

import java.util.Scanner;

public class Stage2_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int hour = scan.nextInt();
		int min = scan.nextInt();

		if(min < 45) {
			if(hour == 0) {
				hour = 23;
			} else {
				hour = hour - 1;
			}
			min = 60 + (min - 45);
		} else {
			min = min - 45;
		}
		System.out.println(hour + " " + min);

		scan.close();
	}
}
