package javaassignment;
public class ObjectClass {

    String name; 
    int age; 
    String std; 
    public ObjectClass (String name, int age, String std) 
    { 
        this.name = name; 
        this.age = age; 
        this.std = std; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getstd() 
    { 
        return std; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy age is and " + this.getAge()+ ", and I'm Studing "+ this.getstd() + "."); 
    } 
    public static void main(String[] args) 
    { 
        ObjectClass yash = new ObjectClass("Yash", 5, "9th"); 
        System.out.println(yash.toString()); 
    } 

	
}
