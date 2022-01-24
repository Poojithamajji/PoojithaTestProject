package javaassignment;
 class Exe {
		   public static void main(String args[]){
			   try{
				System.out.println("Starting of try block");
				throw new ExceptionHandling("This is My error Message");
			}
			catch(ExceptionHandling exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		}
}
