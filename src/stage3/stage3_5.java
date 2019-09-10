package stage3;

import java.util.Scanner;

public class stage3_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i = 1; i <= n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print(' ');
			}
			for(int z = 1; z <= i; z++) {
				System.out.print('*');
			}
			System.out.println();
		}

		scan.close();
	}
}
