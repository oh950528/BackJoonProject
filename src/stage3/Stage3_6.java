package stage3;

import java.util.Scanner;

public class Stage3_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int arr[] = new int[num];

		for(int i = 0; i < arr.length; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr[i] = a + b;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
