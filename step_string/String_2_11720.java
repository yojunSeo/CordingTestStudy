package step_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class String_2_11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			int a = br.read();
			sum += (int) a-'0';
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
