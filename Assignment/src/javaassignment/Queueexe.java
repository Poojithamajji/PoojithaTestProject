package javaassignment;
import java.util.*;

public class Queueexe {

	public static void main(String[] args) {
		Queue <String>locationsQueue = new LinkedList<>();
		locationsQueue.add("Poojitha");
		locationsQueue.add("Sravanthi");
		locationsQueue.add("Revanth");
		locationsQueue.add("Jaswanth");
		locationsQueue.add("Thanshika");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}

}
