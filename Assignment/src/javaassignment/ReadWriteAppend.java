package javaassignment;
import java.io.*;
import java.util.Scanner;

public class ReadWriteAppend {
	public static void main(String[] args) throws Exception
    {
		try {
		      FileWriter myWriter = new FileWriter("java.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		try {
		      File myObj = new File("java.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 String textToAppend = "Happy Learning !!";
	    BufferedWriter writer = new BufferedWriter(
	    new FileWriter("c:/Users/LENOVO/DESKTOP/java.txt", true));    
	    writer.write(textToAppend);
	    writer.close();
    }
}
