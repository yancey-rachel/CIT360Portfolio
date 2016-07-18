package javaCollection;

import java.util.HashMap;
import java.util.Map;
public class MapCollection{
	
	public static void main(String[] args) {
	
		
	HashMap<Integer, String> nmap = new HashMap<Integer, String>();
	
		nmap.put(1,"Daniella" );
		nmap.put(2, "Teagan");
		nmap.put(3,"Jaden" );
		nmap.put(4,"Marie");
		
		
		//calling the value by it's key
		String element= (String) nmap.get(2);
	      System.out.println(element);
	      
	    //Iterate nmap
	     for(Map.Entry<Integer, String> entry:nmap.entrySet()){
	    	 int key = entry.getKey();
	    	 String value = entry.getValue();
	    	 
	    	 System.out.println(key + ": " + value);
	     }
	    System.out.println("---New Map Collection---");
	    //using remove
	     nmap.remove(4);
	     for(Map.Entry<Integer, String> entry:nmap.entrySet()){
	    	 int key = entry.getKey();
	    	 String value = entry.getValue();
	    	 
	    	 System.out.println(key + ": " + value);
	     }
	    
	     
	     
	
	

	}

}