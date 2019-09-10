package stage3;

import java.util.Scanner;

public class stage3_1 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++)
			System.out.println(i);
		
		scan.close();
	}
}
