package javaassignment;

public class KeyWordThrows {
	void Division() throws ArithmeticException
    {
        int a=45,b=5,rs;
        rs = a / b;
        System.out.print("The result is : " + rs);
    }
	public static void main(String[] args) {
		KeyWordThrows T = new KeyWordThrows();
        try
       {
           T.Division();
       }
       catch(ArithmeticException Ex)
       {
           System.out.print("\nError : " + Ex.getMessage());
       }
	}
}
