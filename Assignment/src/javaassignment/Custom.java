package javaassignment;

class Custom extends Exception{
	    public Custom(String s) 
	    { 
	        super(s); 
	    }
public class main{
	public static void main(String[] args) {
        try
        { 
            throw new Custom("temp");
        } 
        catch (Custom ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
}

