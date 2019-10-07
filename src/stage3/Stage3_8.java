package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Stage3_8 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int n = Integer.parseInt(bf.readLine());
					for(int i = 0; i < n; i++) {
						String[] temp = bf.readLine().split(" ");
						bw.write(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]) + "\n");
					}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
