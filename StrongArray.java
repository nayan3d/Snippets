import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class StrongArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 File initialFile = new File("C:/data/numbers.txt");
		 InputStream targetStream = new FileInputStream(initialFile);
		BufferedReader br = new BufferedReader(new InputStreamReader(targetStream));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long[] arr1 = new long[N];
		long[] arr2 = new long[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr1);
		int mid = N / 2;
		int j = N - 1;
		int count = 0;
		int m = 0;
		for (int i = 0; count != N; i++) {
			count++;
			if (i % 2 == 0) {
				arr2[i] = arr1[m];
				m++;
			} else {
				arr2[i] = arr1[j];
				j--;
			}
 
		}
		long sum = 0;
		for (int i = 1; i < N; i++) {
			sum += (long) Math.abs(arr2[i - 1] - arr2[i]);
		}
		sum += (Math.abs(arr2[N - 1] - arr2[0]));
		System.out.println(sum);
		 try {
				PrintWriter pw = new PrintWriter(new File("C:/data/integer.txt"));
			
	        StringBuilder sb = new StringBuilder();
	        sb.append(sum);
	        pw.write(sb.toString());
	        pw.close();
	        System.out.println("done!");
	        } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 
	}
 
}
		

	
