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
		