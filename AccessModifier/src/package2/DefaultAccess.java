package package2;

public class DefaultAccess {

	public static void main(String[] args) {

							System.out.println("Dafault Access Specifier");
							DefaultAccess obj = new DefaultAccess(); 		  
					        obj.display(); 
	}

	private void display() 
			     { 
			         System.out.println("You are using defalut access specifier"); 
			     }

}

	
