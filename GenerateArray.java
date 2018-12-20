import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class GenerateArray {
	
	public static void main(String[] args){
		
		 Scanner scan;
			try {
				scan = new Scanner(new File("C:/data/NumInput.txt"));
				PrintWriter pw = new PrintWriter(new File("C:/data/Arrayoutput.txt"));		
		        
				while(scan.hasNext()){
		        int size=scan.nextInt();
		        if(size<=20)
		        {	       
			    int numRows = (int)Math.pow(2, size);
			    boolean[][] bools = new boolean[numRows][size];
			    for(int i = 0;i<bools.length;i++)
			    {
			        for(int j = 0; j < bools[i].length; j++)
			        {
			            int val = bools.length * j + i;
			            int ret = (1 & (val >>> j));
			            bools[i][j] = ret != 0;
			            int arr = bools[i][j] ? 1 : 0 ;
			            //String arayOut = Arrays.toString(arr);
			            System.out.print(arr + "\t");
			            String a = Integer.toString(arr);
			            pw.write(a+"\t");
			        }
			        System.out.println();
			        pw.write("\r\n");
    }
		        }
		        else
		        {
		        	System.out.println("Please enter number less than 20");
		        }
			    
	}
				pw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
