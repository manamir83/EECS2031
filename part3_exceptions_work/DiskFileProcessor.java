package part3_exceptions_work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DiskFileProcessor {
	
	public static String[] readFiles (String[] names){
		
		String [] lines = new String [names.length];
		FileReader f=null;
		for (int i=0; i<names.length;i++) {
	        // Reading file from path in local directory
		    try {  
				 
		    	f= new FileReader("src/part3_exceptions_work/"+ names[i]);
		
		        // Creating object as one of ways of taking input
		        BufferedReader b = new BufferedReader(f);
				        
		        lines[i]=b.readLine();
		     }
		      catch(FileNotFoundException  e) {
		       lines[i] = "FILE DOESN'T EXIST";	
		    }  
		    catch(IOException  e) {
		       lines[i] = "IO error";	
		    } 
		    catch(ArrayIndexOutOfBoundsException  e) {;}
		    
		    		    
		/*  finally {
	    	
	    	// Closing file connections
        // using close() method
        try {
	    //	f.close();
	    } catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
	    }

        }*/ 
		   
	  
	  }
      return lines;
	}
}
