package javaassignment;

import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"poojitha");    
	      hm.put(2,"majji");    
	      hm.put(3,"pooja");   
	       
	      System.out.println("The elements are ");  
	      for(Entry<Integer, String> a:hm.entrySet()){    
	       System.out.println(a.getKey()+" "+a.getValue());    
	      }
	}
}
