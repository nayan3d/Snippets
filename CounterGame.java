import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;


public class CounterGame {
	
	 public static void find_winner(BigInteger N) {
	 String winner = "B";
     if (N.equals(BigInteger.valueOf(1))) {
         System.out.println(winner);
     } else {
     	// convert N to binary. It's a given that this binary number starts with 1.
     	String binary_N = N.toString(2);
         winner = "A";
         while (true) {
             // if N is a power of 2, divide by 2 i.e. shift number 1 place right
             // if N is not a power of 2, subtract from largest power of 2 i.e. the leftmost 1
             // always check if N is 1 at the end 
         	int first_one = binary_N.indexOf("1", 1);
         	if (first_one == -1) {		// N is power of 2 (is in the form of 100...0)
         		binary_N = binary_N.substring(0, binary_N.length()-1);
         		if (binary_N.equals("1")) {
         			System.out.println(winner);
         			break;
         		} else {
         			winner = flip_winner(winner);
         		}
         	} else {					// N is not power of 2
         		binary_N = binary_N.substring(first_one);
         		if (binary_N.equals("1")) {
         			System.out.println(winner);
         			break;
         		} else {
         			winner = flip_winner(winner);
         		}
         	}
         }
         
         
     }
 }
 
 public static String flip_winner(String winner){
     if (winner == "B"){
         return "A";
     } else {
         return "B";
     }      
 }
 
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int number_of_tests = sc.nextInt();
     for (int i=0; i<number_of_tests; i++) {
         find_winner(sc.nextBigInteger());
     } 
 }

}
