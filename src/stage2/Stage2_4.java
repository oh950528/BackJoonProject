package stage2;

import java.util.Scanner;

public class Stage2_4 {

	public static void main(String[] args) {

		int a, b , c;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		System.out.println((a + b) % c);
		System.out.println((a%c + b%c) % c);
		System.out.println((a*b) % c);
		System.out.println((a%c * b%c) % c);
		
		scan.close();
	}

}
