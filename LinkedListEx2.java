package github_repository;
import java.util.*;
public class LinkedListEx2 {

	

	
	    public static void main(String[] args) {

	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Blue");
	        list.add("Green");
	        list.add("Yellow");

	        System.out.println("Reverse order:");

	        Iterator<String> iterator = list.descendingIterator();

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}
