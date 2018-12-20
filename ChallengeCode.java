import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ChallengeCode {

			
		 public static void checkIfEqualOption1(int[] arr){

		        int sumTotal=0;
		        String found ="";
		        for (int i=0; i < arr.length; i++){ // O(arr.length)
		            sumTotal += arr[i];
		        }

		        int sumRight = 0;
		        int sumLeft=0;
		        for (int i=1; i < arr.length; i++){ // O(arr.length)
		            sumLeft += arr[i-1];
		            sumRight = sumTotal - arr[i] - sumLeft;
		            if (sumRight == sumLeft){
		                System.out.println("\nFound = "+arr[i]);
		                found = found+arr[i]+",";
		            }
		        }
		        System.out.println("Found -- "+found);
		        
		        try {
					PrintWriter pw = new PrintWriter(new File("C:/data/code.csv"));
				
		        StringBuilder sb = new StringBuilder();
		        sb.append(found);
		        pw.write(sb.toString());
		        pw.close();
		        System.out.println("done!");
		        } catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   }


		   public static void main(String[] args) {

		   //  int[] numbers = {-1,3,-4,5,1,-6,2,1};
			   String str="";
		     int count = 0;
			  int[] numbers = null;
			   Scanner scanner = null;
			try {
				scanner = new Scanner(new File("C:/data/abc.csv"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		        scanner.useDelimiter(",");
		        while(scanner.hasNext()){		        	
		        	 str = str+scanner.next()+",";		       
		        		count++;		        	
		        }		      
				System.out.println("STR -- "+str);
		        System.out.println("Count is "+count);		       
		        scanner.close();
		        
		        String[] strArray = str.split(",");
		        int[] intArray = new int[strArray.length];
		        for(int i = 0; i < strArray.length; i++) {
		        	intArray[i] = Integer.parseInt(strArray[i]);
		        }
		      
		        
		     System.out.println("Array numbers:");
		     for (int i=0; i < intArray.length; i++){
		          System.out.print(intArray[i] + " ");
		     }
		     System.out.println("\n");
		     checkIfEqualOption1(intArray);
		   }

		

	}


