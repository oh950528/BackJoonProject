package stage3;

import java.util.Scanner;

public class Stage3_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x = scan.nextInt();
		int[] arr = new int[num];

		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < x)
				System.out.print(arr[i] + " ");
		}
	}
}
