package javaassignment;

public class StringtoPrimitiveDT {

	public static void main(String[] args) {
		System.out.println("Converting String into other primitive data types");
		String s1 ="1115";
		int i =Integer.valueOf(s1); 
		System.out.println("int: "+i);
		
		String s2 = "0.8";
	      float floatVal = Float.valueOf(s2);
	      System.out.println("Float: "+floatVal);
	      
	      String s3 = "5";
	      Long myLong = Long.valueOf(s3);
	      System.out.println("Long: "+myLong);
	      
	      String s4 = "699.7e130";
	       double val = Double.valueOf(s4);
	       System.out.println("Double: "+val);
	       
	       String s5="true"; 
	       boolean b1=Boolean.valueOf(s5);  
	       System.out.println("Boolean: "+b1); 
	       
	       String s6="hello";  
	       char c=s6.charAt(0);
	       System.out.println("Character: "+c);  
		
	}

}
