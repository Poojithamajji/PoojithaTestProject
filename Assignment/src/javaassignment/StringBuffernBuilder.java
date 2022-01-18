package javaassignment;

public class StringBuffernBuilder {
	

	public static void main(String[] args) {
		String str = "Hello"; 
      
		StringBuffer sBuffer = new StringBuffer("String to StringBuffer");
	      sBuffer.append("Conversion");
	      System.out.println(sBuffer); 
          
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}

}
