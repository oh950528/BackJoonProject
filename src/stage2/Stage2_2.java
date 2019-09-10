package stage2;

import java.util.Scanner;

public class Stage2_2 {

	public static void main(String[] args) {
		double a, b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		System.out.println(a/b);
		
		scan.close();
	}
}
