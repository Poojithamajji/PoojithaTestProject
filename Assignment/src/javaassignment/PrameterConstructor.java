package javaassignment;

public class PrameterConstructor {
	int id;  
    String name;   
	public PrameterConstructor(int i, String n) {
		 id = i;  
		 name = n; 
	}
	void ParameterConstructor(int i,String n){  
    
    }  
    void display(){
    	System.out.println(id+" "+name);
    	}  

	public static void main(String[] args) {
		PrameterConstructor s1 = new PrameterConstructor(104,"Poojitha");  
		PrameterConstructor s2 = new PrameterConstructor(105,"siri");  
		    s1.display();  
		    s2.display();  

	}

}
