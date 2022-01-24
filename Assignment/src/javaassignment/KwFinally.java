package javaassignment;

public class KwFinally {

	public static void main(String[] args) {
		int a=45,b=3,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\nThe result is : " + rs);
        }
        
	}

}
