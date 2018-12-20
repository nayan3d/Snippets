import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Panagram {
	
	    public static void main(String args[]){

        Scanner scan;
		try {
			scan = new Scanner(new File("C:/data/panagram.txt"));
			PrintWriter pw = new PrintWriter(new File("C:/data/panagram_output.txt"));		
	        
			while(scan.hasNext()){
	        String str=scan.nextLine();
	        if(checkPanagram(str)){
	            System.out.println("pangram");        
	        	pw.write("\r\n panagram \r\n");
		       
	        } else{
	            System.out.println("not pangram");       
	    	pw.write("\r\n not panagram \r\n");
	        }
	        
			}
			pw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
	    
	    public static boolean checkPanagram(String str){

	        str=str.toUpperCase();
	        int count=0;
	        for(char c='A';c<='Z';c++){
	            if( (str.indexOf(c)>=0) )
	                count++;
	        }
	        if(count ==26)
	            return true;
	        else
	            return false;
	    }

}
