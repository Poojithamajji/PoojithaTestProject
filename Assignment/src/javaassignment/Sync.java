package javaassignment;

public class Sync{
	public static void main(String args[]) 
    { 
        Sender snd = new Sender(); 
        Synchronization  S1 = 
            new Synchronization ( " Hello Have a great day " , snd ); 
        Synchronization  S2 = 
            new Synchronization ( " Hope your day is good" , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 

}
