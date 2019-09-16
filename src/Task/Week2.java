//2주차 과제
//백준1138-한 줄로 서기
package Task;

import java.util.Scanner;

public class Week2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();

		int arr[] = new int[index];
		int overHeight;

		for(int i = 0; i < index; i++) {
			overHeight = scan.nextInt();

			for(int j = 0; j < index; index++) {
				if(overHeight == 0) {
					arr[i] = i + 1;
					break;
				} else if(arr[j] == 0) {
					overHeight--;
				}
			}
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}



	}
}