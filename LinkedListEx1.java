package github_repository;
import java.util.*;
public class LinkedListEx1 {

	

	
	    public static void main(String[] args) {

	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Blue");
	        list.add("Green");
	        list.add("Yellow");

	        System.out.println("Original List: " + list);

	        // Start iteration from 2nd position (index 1)
	        ListIterator<String> iterator = list.listIterator(1);

	        System.out.println("Iterating from 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}