package Package1;
public class PrivateAccess {
	  private String fname = "poojitha";
	  private String lname = "majji";
	  private String email = "poojitham@gmail.com";
	  private int age = 23;
	  
	  public static void main(String[] args) {
		  PrivateAccess myObj = new PrivateAccess();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	}

//class privateam{
//private int data= 123;
//private void  msg () {
	//System.out.println("Private Access Specifier");
//}
//}
//public class PrivateAccess {

//public static void main(String[] args) {
				//privateam  obj = new privateam ();
				//System.out.println(obj.data);
				//obj.msg();
		//}
//}
