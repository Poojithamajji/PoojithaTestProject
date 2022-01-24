package javaassignment;
		class ExceptionHandling extends Exception{
			   String str1;
			   ExceptionHandling(String str2) {
				str1=str2;
			   }
			   public String toString(){ 
				return ("MyException Occurred: "+str1) ;
			   }
			}
		class Example1{
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